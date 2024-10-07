plugins {
    base
    kotlin("jvm") version "1.9.25" apply false
}

allprojects {

    group = "org.gradle.kotlin.dsl.samples.multiproject"

    version = "1.0"

    repositories {
        mavenCentral()
    }
}
