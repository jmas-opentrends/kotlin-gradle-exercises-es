plugins {
    application
    kotlin("jvm")
}

/**
 * TODO: Ejecutamos la funcion kotlinProject() para agregar las dependencias
 */

application {
    mainClass.set("cli.Main")
}

dependencies {
    implementation(project(":core"))
}
