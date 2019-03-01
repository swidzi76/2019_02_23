package javafx;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalTime;


public class HelloWorldFx extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("To jest okienko z czasem!");
        Label labelTime = new Label("czas");
        TextField textField = new TextField();
        textField.appendText("To jest pole tekstowe");
        LocalTime czas = LocalTime.now();
        //Timer timer new Timer();
        //timer.schedule(timerTask,0, 1000 );
        System.out.println(czas);
        int hour    = czas.getHour();
        int min     = czas.getMinute();
        int sec     = czas.getSecond();
        String str = "Jest : "+hour+" : "+min+" : "+sec;
        labelTime.setText(str);

        Button button = new Button("Start");

        button.setOnAction(e -> System.out.println("Button was clicked!"));
        VBox box = new VBox();
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(label, labelTime, button, textField);

        primaryStage.setTitle("Hello World - JavaFX");
        primaryStage.setScene(new Scene(box, 300, 200));
        primaryStage.show();

    }
}
