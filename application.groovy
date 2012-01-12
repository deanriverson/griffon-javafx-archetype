/*
 * Copyright 2011-2012 the original author or authors.
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
 * @author Dean Iverson
 * @author Andres Almiray
 */
 
import griffon.util.Metadata

includeTargets << griffonScript('CreateMvc')

/**
 * Create the JavaFX builder configuration
 */
def createBuilderConfig = {
    def builderConfigFile = new File("${basedir}/griffon-app/conf/Builder.groovy")
    builderConfigFile.append('''
        |root {
        |    'griffon.javafx.JavaFXApplicationBuilder' {
        |        view = '*'
        |    }
        |}'''.stripMargin())
}

target(name: 'createApplicationProject', description: 'Creates a new app project', prehook: null, posthook: null) {
    createProjectWithDefaults()

    // Install the javafx plugin
    Metadata md = Metadata.getInstance(new File("${basedir}/application.properties"))
    installPluginExternal md, 'javafx'

    argsMap.view       = 'ApplicationView'
    argsMap.controller = 'ApplicationController'
    argsMap.model      = 'ApplicationModel'
    createMVC()

    createBuilderConfig()
}

setDefaultTarget(createApplicationProject)
