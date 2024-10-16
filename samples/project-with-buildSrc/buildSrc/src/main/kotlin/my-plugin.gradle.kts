/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * TODO: Define una extensión de Project llamada `my` y guardala en la variable del mismo nombre.
 */
val my = extensions.create<MyProjectExtension>("my", project.objects)

/**
 * TODO: registra la tarea `myReport` que imprime el valor de la propiedad `flag` del objeto `my`
 */
tasks.register("myReport") {
    doLast {
        println("my.flag = ${my.flag.get()}")
    }
}
