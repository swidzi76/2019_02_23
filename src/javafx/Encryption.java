package javafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Base64;

public class Encryption extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Zaszyfruj tekst");
//        Text text = new Text("Click the button to change label");
//        button.setOnAction(e -> text.setText("Button was clicked!"));

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        button.setOnAction(e -> {
            String string = textField1.getText();
            textField2.setText(encryption(string));

        });


//        Label label = new Label();
//        ObjectProperty<Font> fontProperty = label.fontProperty();
//        fontProperty.setValue(new Font(24));
//        textField.setOnAction(e -> label.setText(textField.getText()));

        VBox box = new VBox();
        ObservableList<Node> children = box.getChildren();
//        children.addAll(button, text, textField, label);
        children.addAll(textField1, button, textField2);

        primaryStage.setTitle("Without FXML");
        primaryStage.setScene(new Scene(box, 300, 200));
        primaryStage.show();
    }
    public static String encryption(String string) {
        return Base64.getEncoder().encodeToString(string.getBytes());

    }
    public static String decryption(String string) {
        return Base64.getDecoder().decode(string).toString();

    }




}

