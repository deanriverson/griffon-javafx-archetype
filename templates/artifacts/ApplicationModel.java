@artifact.package@import java.util.Map;
import org.codehaus.griffon.runtime.core.AbstractGriffonModel;
import javafx.beans.property.*;
import static griffon.util.ConfigUtils.getConfigValueAsString;
import static griffon.util.GriffonNameUtils.capitalize;

public class @artifact.name@ extends AbstractGriffonModel {
    private StringProperty message = new SimpleStringProperty("message");
    public final String getMessage() { return message.get(); }
    public final void setMessage(String message) { this.message.set(message); }
    public final StringProperty messageProperty() { return message; }
    
    public void mvcGroupInit(Map<String, Object> args) {
        setMessage(
            "Welcome to " +
            capitalize(getConfigValueAsString(getApp().getConfig(), "application.title")) +
            ", a JavaFX application"
        );
    }
}
