@artifact.package@import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradientBuilder;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.codehaus.griffon.runtime.core.AbstractGriffonView;

import java.util.Map;

public class @artifact.name@ extends AbstractGriffonView {
    // these will be injected by Griffon
    private @artifact.name.plain@Controller controller;
    private @artifact.name.plain@Model model;

    public void setController(@artifact.name.plain@Controller controller) {
        this.controller = controller;
    }

    public void setModel(@artifact.name.plain@Model model) {
        this.model = model;
    }

    // build the UI
    private Scene init() {
        Scene scene = new Scene(new Group());
        scene.setFill(Color.BLACK);

        Text javaText = new Text();
        javaText.setText("Java");
        javaText.setFont(new Font("Sanserif", 80));
        javaText.setFill(LinearGradientBuilder.create().endX(0)
                .stops(new Stop(0, Color.ORANGE), new Stop(1, Color.CHOCOLATE)).build());

        Text fxText = new Text();
        fxText.setText("FX");
        fxText.setFont(new Font("Sanserif", 80));
        fxText.setFill(LinearGradientBuilder.create().endX(0)
                .stops(new Stop(0, Color.CYAN), new Stop(1, Color.DODGERBLUE)).build());
        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.DODGERBLUE);
        dropShadow.setRadius(25);
        dropShadow.setSpread(0.25);
        fxText.setEffect(dropShadow);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(javaText, fxText);
        hbox.setPadding(new Insets(80, 80, 80, 80));
        ((Group) scene.getRoot()).getChildren().addAll(hbox);

        return scene;
    }

    @Override
    public void mvcGroupInit(final Map<String, Object> args) {
        execInsideUISync(new Runnable() {
            public void run() {
                Stage stage = (Stage) getApp().createApplicationContainer();
                stage.setTitle("@griffon.project.name@");
                stage.setWidth(400);
                stage.setHeight(300);
                stage.setScene(init());
                stage.show();
            }
        });
    }
}
