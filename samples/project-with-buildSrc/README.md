# Ejercicio: Crear un plugin de Gradle en buildSrc con parametrización

Igual que hemos visto en el ejercicio anterior, vamos a crear un plugin de Gradle en `buildSrc`, pero esta vez, vamos a
permitir que el usuario pueda parametrizar propiedades del plugin.

## Tarea

Esta vez, con un plugin un poco más complejo, hemos de crear un plugin para Gradle y este va a permitir su
parametrización.

Por una parte, nuestro plugin va a poner a disposición del usuario una función `withHelloTask` que añadira una tarea
bajo demanda al proyecto.

Por otra parte, el plugin va a permitir que el usuario pueda parametrizar el mensaje que se mostrará en la tarea.
Esta parametrización se printará en una tarea que se llamará `myReport`.

## Pasos

1. Ve a la carpeta `buildSrc/src/main/kotlin` y familiarízate con el código que hay en `extension.kt`.
2. Vamos al fichero `HelloTask.tk`. Allí deberás crear una clase HelloTask (que extienda de DefaultTask) y añadirle
   un método run (@TaskAction) que imprima un mensaje por pantalla "I'm <project-name>" y que defina un nuevo metodo
   para el fichero de gradle.
3. Fíjate en el contenido de `MyProjectExtension`. Allí hemos definido una propiedad flag que guarda un Boolean.
4. Ve al `my-plugin-gradle.kts` y sigue las instrucciones para añadir la extension de Gradle.
5. Finalmente, ve al `build.gradle.kts` de la raíz y añade el plugin y configurálo.
6. Ejecuta la tarea `hello` y mira si el flag se muestra en pantalla.
7. Si has completado la tarea opcional del punto 5, ejecuta la tarea `myReport` y mira si el
   perfil se muestra en pantalla.
