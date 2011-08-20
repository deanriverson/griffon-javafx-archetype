@artifact.package@

import groovyx.javafx.beans.FXBindable
import griffon.util.GriffonNameUtils

class @artifact.name@ {
    @FXBindable String message

    void mvcGroupInit(Map args) {
        message = "Welcome to ${GriffonNameUtils.capitalize(app.config.application.title)}, a JavaFX application"
    }
}
