# Ejercicio: Plugin de Gradle en buildSrc

En este ejercicio, vamos a crear un plugin de Gradle en el proyecto `buildSrc`. Como ya vímos anteriormente, la carpeta
`buildSrc` es un proyecto Gradle que se compila antes que el proyecto principal. En este caso, vamos a crear un plugin
que nos permita definir una tarea que imprima un mensaje en la consola.

Como con el ejercicio anterior, hemos borrado el contenido de los ficheros de Gradle, y es tu tarea rellenarlos.

## Tarea

En este proyecto tenemos el

## Pasos

1. Abre el fichero `buildSrc/src/main/kotlin/GreetPlugin.kt`, en este deberas implementar la clase `GreetPlugin` para
   ser un plugin de Gradle.
2. Abre el fichero `buildSrc/build.gradle.kts`, en este deberas definir el plugin que acabas de crear.
3. Finalmente, ve al fichers `build.gradle.kts` y instala el plugin que acabas de crear.
4. Ejecuta la tarea `greet` y comprueba que imprime el mensaje en la consola.
