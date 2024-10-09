tasks {

    /**
     * TODO: Define la tarea plugin (GradleBuild) que ejecutará el plugin.
     *  Directorio: plugin, tareas: publish
     */
    val plugin by registering(GradleBuild::class) {
        group = "sample"
        dir = file("plugin")
        tasks = listOf("publish")
    }

    val consumer by registering(GradleBuild::class) {
        group = "sample"
        dir = file("consumer")
        tasks = listOf("myCopyTask")
    }

    /**
     * TODO: Define la tarea consumer (GradleBuild) que ejecutará compilará el `consumer`.
     *  Directorio: consumer, tareas: myCopyTask.
     *  Haz que el consumer dependa del plugin.
     */
    consumer {
        dependsOn(plugin)
    }
}
