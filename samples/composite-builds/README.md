# Ejercicio: Builds Compuestos

Los composite builds de Gradle permiten trabajar con varios proyectos en paralelo,
sin necesidad de publicarlos en un repositorio. En este ejercicio, vamos a trabajar
con un composite build que incluye dos proyectos, uno de ellos dependiente del otro.

## Tarea

El proyecto `cli` depende de `core`. Ambos subproyectos estan en el mismo proyecto.
El poyecto `core` ya esta definido, tu tendrás que definir el proyecto `cli` y el
composite build en el proyecto raíz.

## Pasos

1. Familiarizate con el proyecto `core`
2. Vamos al fichero `cli/build.gradle.kts` y define el proyecto `cli`.
3. En el fichero `build.gradle.kts` del proyecto raíz, definiremos la tarea `run`
   que ejecutará el proyecto `cli`.
4. Finalmente, en el `settings.gradle.kts` del proyecto raíz, definiremos el composite build,
   haciendo uns sustitución de dependencias.
5. Ejecuta la tarea `run` y verifica que todo funciona correctamente y que obtienes
   la respuesta de la vida, el universo y todo lo demás.
