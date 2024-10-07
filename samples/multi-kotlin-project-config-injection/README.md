# Ejercicio: Multi-proyecto con inyección de configuración

En este ejercicio vamos a crear un proyecto Gradle en configuración de multi-proyecto.

# Tarea

En este proyecto, vemos una estructura similar a la del ejercicio anterior: `core` y `cli`.
Esta vez, vamos a configurar el proyecto raíz para que configure los dos proyectos
de forma automática. Además, vamos a inyectar la configuración del proyecto raíz en los
proyectos hijo.

# Pasos

1. El poryecto `core` ya está configurado.
2. Vamos al `cli/build.gradle` y lo configuramos, añadiendo `core` como dependencia.
3. Vamos al `build.gradle` del proyecto raíz y configuramos los proyectos hijos.
4. Finalmente, vamos al `settings.gradle` y configuramos los proyectos hijos.
5. Ejecutamos la tarea `build` y comprobamos que el proceso finaliza correctamente.
