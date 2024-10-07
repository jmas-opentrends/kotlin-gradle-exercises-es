import java.io.File
import java.security.MessageDigest
import java.math.BigInteger

plugins {
    base
}

tasks {
    val samplesWrappers by registering {
        doLast {
            val wrapperFiles = wrapper.get().run {
                listOf(scriptFile, batchScript, jarFile, propertiesFile).associateBy { it.name }
            }

            val hashes = wrapperFiles.mapValues { sha256(it.value) }

            file("samples").walk().filter { it.isFile && it.name in wrapperFiles }.forEach { sampleWrapperFile ->
                wrapperFiles.getValue(sampleWrapperFile.name).let { wrapperFile ->
                    if (sha256(sampleWrapperFile) != hashes.getValue(sampleWrapperFile.name)) {
                        logger.lifecycle("Updating ${sampleWrapperFile.relativeTo(rootDir)}")
                        wrapperFile.copyTo(sampleWrapperFile, overwrite = true)
                    }
                }
            }
        }
    }

    wrapper {
        distributionType = Wrapper.DistributionType.ALL
        finalizedBy(samplesWrappers)
    }
}

/**
 * Calculates the SHA-256 hash of a file.
 */
fun sha256(file: File): String {
    val buffer = file.readBytes()
    val digest = MessageDigest.getInstance("SHA-256")
    val hash = digest.digest(buffer)
    return BigInteger(1, hash).toString(16).padStart(64, '0')
}
