import griffon.util.Metadata

includeTargets << griffonScript("_GriffonPlugins")
includeTargets << griffonScript("_GriffonInit")
includeTargets << griffonScript("CreateMvc")

/**
 * Create the JavaFX builder configuration
 */
def createBuilderConfig = {
    def builderConfigFile = new File("${basedir}/griffon-app/conf/Builder.groovy")
    builderConfigFile.text = """\
        |root {
        |    'griffon.javafx.JavaFXApplicationBuilder' {
        |        view = '*'
        |    }
        |}""".stripMargin()
}

target(name: 'createApplicationProject', description: 'Creates a new app project', prehook: null, posthook: null) {
    createProjectWithDefaults()

    argsMap.view = 'ApplicationView'
    argsMap.controller = 'ApplicationController'
    argsMap.model = 'ApplicationModel'
    createMVC()

    createBuilderConfig()

    // Install the javafx plugin
    Metadata md = Metadata.getInstance(new File("${basedir}/application.properties"))
    //installPluginExternal md, 'javafx'
}

setDefaultTarget(createApplicationProject)
