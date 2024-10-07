# Ejercicios de Gradle con Kotlin DSL

Este ejercicio esta compuesto de diferentes partes, cada una de ellas ofreciendo una plataforma para poder
practicar diferentes funcionalidades de Gradle y Kotlin DSL.
A continuación se detallan los objetivos y las instrucciones para comenzar.

## Objetivos de Aprendizaje

- Ver las diferentes funcionalidades de Gradle
- Practicar con el Kotlin DSL de Gradle
- Establecer dependencias entre tareas
- Configurar proyectos multi-proyecto
- Crear plugins de Gradle

## Instrucciones para Comenzar

### 1. Realiza un Fork del Repositorio

- Haz clic en el botón **"Fork"** en la esquina superior derecha del repositorio para crear una copia en tu cuenta de GitHub.

### 2. Clona tu Repositorio Forkeado

```bash
git clone https://github.com/tu-usuario/nombre-del-repositorio.git
cd nombre-del-repositorio
```

### 3. A trabajar

- Ve por cada uno de los proyectos, recomendamos abrir en el IntelliJ IDEA o Android Studio cada uno
  de los proyectos por separado.
- En cada proyecto encontraras un README con las instrucciones generales
- En los ficheros que se indican encontraras comentarios con `TODO` que deberás completar.

## Flujo de Trabajo Recomendado

1. **Fork**: Crea una copia personal del repositorio para trabajar independientemente.
2. **Work**: Implementa las funciones y pruebas en tu entorno local.
3. **Test Locally**: No hay tests automaticos para este ejercicio. Basicamente los scripts deben acabar y hacer lo que se espera de ellos.
4. **Push**: Sube tus cambios a tu repositorio en GitHub.
5. **Pull Request**: Envía un Pull Request al repositorio original para revisión.

## Orden de los Ejericios

1. [task-dependencies](samples/task-dependencies)
2. [buildSrc-plugin](samples/buildSrc-plugin)
3. [project-with-buildSrc](samples/project-with-buildSrc)
4. [precompiled-script-plugin](samples/precompiled-script-plugin)
5. [composite-builds](samples/composite-builds)
6. [multi-kotlin-project-config-injection](samples/multi-kotlin-project-config-injection)
7. [multi-kotlin-project-with-buildSrc](samples/multi-kotlin-project-with-buildSrc)

¡A compilar!
