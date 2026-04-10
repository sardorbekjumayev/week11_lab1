package com.example.week11_lab1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TrafficLigh extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Circle redCircle = new Circle(30);
        redCircle.setFill(Color.RED);
        redCircle.setStroke(Color.DARKGRAY);
        redCircle.setStrokeWidth(2);

        Circle yellowCircle = new Circle(30);
        yellowCircle.setFill(Color.YELLOW);
        yellowCircle.setOpacity(0.3);
        yellowCircle.setStroke(Color.DARKGRAY);
        yellowCircle.setStrokeWidth(2);

        Circle greenCircle = new Circle(30);
        greenCircle.setFill(Color.GREEN);
        greenCircle.setOpacity(0.3);
        greenCircle.setStroke(Color.DARKGRAY);
        greenCircle.setStrokeWidth(2);

        Text stopText = new Text("Stop");
        stopText.setFill(Color.RED);
        stopText.setFont(Font.font("Times New Roman",FontWeight.BOLD, 20));

        VBox vbox = new VBox(10, redCircle, yellowCircle, greenCircle, stopText);
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);


        Scene scene = new Scene(vbox, 400, 400);
        stage.setScene(scene);
        scene.setFill(Color.DARKGRAY);
        stage.setTitle("Traffic Light");
        stage.show();
    }
}
