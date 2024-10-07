/**
 * An example Gradle task.
 */
open class GreetingTask : DefaultTask() {
    @get:Input
    val message = project.objects.property<String>()

    @TaskAction
    fun greet() = println(message.get())
}

tasks {

    /**
     * TODO: Añadir una tarea `hello` del tipo `GreetingTask`
     *  que imprima "Hello!".
     *
     *  val <task_name> by registering(<task_type>::class)
     */


    /**
     * TODO: Añadir una tarea `goodbye` del tipo `GreetingTask`
     *  no configures nada por defecto.
     */


    /**
     * TODO: haz que la tarea `goodbye` dependa de la tarea `hello`.
     */


    /**
     * TODO: Ahora, sin usar la variable `goodbye`, utiliza el método
     *  `named<T>(name: String)` para obtener la tarea `goodbye` y
     *  configurala para que imprima "Goodbye!".
     */


    /**
     * TODO: Finalmente, añade una tarea `chat` que dependa de `goodbye`.
     *  Para ello puedes utilizar `tasks.register`. Recuerda que ya estamos
     *  en el bloque `tasks`.
     */

}

/**
 * TODO: Abre un nuevo bloque de tareas. No tiene mucho sentido
 *  pero lo hacemos para practicar.
 */
tasks {

    /**
     * TODO: Utiliza el método `existing<T>(name: String)` para obtener
     *  la tarea `goodbye` y añade una dependencia a la tarea `chat`.
     */

}
