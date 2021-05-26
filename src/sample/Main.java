package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Label label = new Label("تطبيق جافا أف إكس");
        Button button = new Button("زر تطبيقي");
        VBox box = new VBox(15, label, button);
        box.setAlignment(Pos.CENTER);
        Scene scene = new Scene(box, 700, 300);
        scene.getStylesheets().add(getClass().getResource("resources/style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
