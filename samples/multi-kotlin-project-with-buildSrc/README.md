# Ejercicio: Multi-proyecto con `buildSrc`

En este ejercicio, vamos a configurar un multi-proyecto de Gradle
pero esta vez, vamos a utilizar un proyecto `buildSrc` para compartir
la configuración de los proyectos en vez de inyectarlos.

## Pasos

1. Vamos al fichero `buildSrc/src/main/kotlin/utils.kt` y creamos la funcion
   `Project.kotlinProject()` para añadir esta funcionalidad como plugin.
2. En el `settings.gradle.kts`, añadimos los proyectos necesarios.
3. En los respectivos ficheros `build.gradle.kts`, de `core` y `cli`, añadimos
   la dependencia al plugin `kotlinProject`.
4. Ejecutamos la tarea build y comprobamos que todo funciona correctamente.

