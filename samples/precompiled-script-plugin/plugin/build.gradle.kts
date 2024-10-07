/**
 * TODO: Añadimos el plugin de maven-publish y kotlin-dsl.
 */


group = "my"
version = "1.0"

/**
 * TODO: Ejecutamos `publishing` para añadir un repositorio maven local.
 *  Para ello, ejecutamos `maven(url = "build/repository")`. Esto creará un repositorio
 *  maven en la carpeta `build/repository` del plugin.
 */

repositories {
    mavenCentral()
}
