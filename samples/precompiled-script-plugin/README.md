# Ejercicio: Implementación de un plugin de Gradle pre-compilado

En este ejercicio vamos a crear un plugin de Gradle pre-compilado. A diferencia
del plugin que hemos creado anteriormente, este plugin tendrá dependencias propias
y se publicará en un repositorio (en este caso local).

## Tarea

En este proyecto hay configurados dos subproyectos: `plugin` y `consumer`. Como
su nombre indica, el subproyecto `plugin` contendrá el código del plugin y el
subproyecto `consumer` será un proyecto que consumirá el plugin.

El plugin simplemente define una tarea `myCopyTask` que copia un archivo del src
al build. El consumidor simplemente aplica el plugin y ejecuta la tarea.

## Pasos

1. Empezamos por el `plugin`. Familiarizate con el código kts y la tarea que define.
2. Vamos al `plugin/build.gradle.kts` y añadimos la configuración para publicar el plugin.
3. Vamos ahora al `consumer`. En su `build.gradle.kts` añadimos la configuración para
   que pueda consumir el plugin definido anteriormente `my-plugin`.
4. En el fichero `settings.gradle.kts` del `consumer` debemos añadir la referencia al
   repositorio local donde se publicará el plugin.
5. Finalmente, en el `build.gradle.kts` del proyecto raíz, añadiremos las dos tareas para cada
   uno de los subproyectos.

