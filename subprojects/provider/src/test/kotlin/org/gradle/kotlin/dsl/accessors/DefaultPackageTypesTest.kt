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

package org.gradle.kotlin.dsl.accessors

import org.gradle.kotlin.dsl.accessors.TypeAccessibility.Accessible
import org.gradle.kotlin.dsl.fixtures.classLoaderFor
import org.gradle.kotlin.dsl.support.useToRun

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

import org.junit.Test


class DefaultPackageTypesTest : TestWithClassPath() {

    @Test
    fun `#defaultPackageTypesIn generic type`() {

        assertThat(
            defaultPackageTypesIn(listOf("gradle.Container<Extension>")),
            equalTo(listOf("Extension"))
        )
    }

    @Test
    fun `#importsRequiredBy takes container elements into account`() {

        val classPath = classPathWithPublicTypes(
            "Container",
            "DefaultPackageType"
        )
        classLoaderFor(classPath).useToRun {
            assertThat(
                importsRequiredBy(
                    ProjectSchema(
                        containerElements = listOf(
                            ProjectSchemaEntry(
                                Accessible(schemaTypeFor("Container")),
                                "element",
                                Accessible(schemaTypeFor("DefaultPackageType"))
                            )
                        ),
                        extensions = emptyList(),
                        conventions = emptyList(),
                        tasks = emptyList(),
                        configurations = emptyList()
                    )
                ),
                equalTo(
                    listOf("DefaultPackageType")
                )
            )
        }
    }
}
