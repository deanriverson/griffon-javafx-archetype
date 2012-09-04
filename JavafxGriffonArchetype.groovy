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
class JavafxGriffonArchetype {
    String version = '0.3'
    String griffonVersion = '1.0.2 > *'
    String license = 'Apache Software License 2.0'
    String source = 'https://github.com/deanriverson/griffon-javafx-archetype'
    String documentation = ''
    List authors = [
        [
            name: 'Dean Iverson',
            email: 'deanriverson@gmail.com'
        ]
    ]
    String title = 'Griffon JavaFX Archetype'
    String description = '''
This archetype allows you to quickly create a new [JavaFX][1] Griffon application. 

This archetype assumes the existance of JavaFX on your computer with the JAVAFX_HOME 
environment variable pointing to the location of the JavaFX SDK.

Usage
----
First, ensure that the archetype is installed on your computer by running the 
`install-archetype` command.  Instructions can be found on the [Installation][2] tab above.

Then simply specify the name of the archetype (*javafx*) when invoking the `create-app`
command, like this

    griffon create-app sample -archetype=javafx

Configuration
-------------
There's no additional configuration required by this archetype.

[1]: http://javafx.com/
[2]: http://artifacts.griffon-framework.org/archetype/javafx/installation
'''
}
