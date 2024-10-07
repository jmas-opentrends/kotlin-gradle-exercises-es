# Ejercicio: Establecer dependencias entre tareas

En este ejercicio, vamos a establecer dependencias entre tareas
de gradle. Para ello, hemos borrado todos los archivos de configuración
de gradle y hemos dejado un archivo `build.gradle.kts` y `settings.gradle.kts`
vacíos.

## Tarea

Crear las tareas `hello`, `chat` y `goodbye` que muestren por consola
un saludo, una conversación y una despedida, respectivamente.

La tarea `chat` debe depender de la tarea `hello` y la tarea `goodbye`,
y la tarea `goodbye` debe depender de la tarea `hello`.

Tambien vamos a practicar las diferentes formas de definir y interactuar con
tareas en gradle kotlin dsl. Para ello, vamos a dar alguna vuelta que otra,
todo definido en los pasos.

## Pasos

1. Ve al fichero `build.gradle.kts`.
2. Sigue las instrucciones de los TODOs que encontrarás en el fichero.
3. Ejecuta la tarea `hello` con el comando `./gradlew -q hello`. Y observa
   que se muestra por consola el saludo.
4. Ejecuta la tarea `chat` con el comando `./gradlew -q chat`. Y observa
   que se muestra por consola el saludo, la conversación y la despedida.
5. Ejecuta la tarea `goodbye` con el comando `./gradlew -q goodbye`. Y observa
   que se muestra por consola la despedida.
