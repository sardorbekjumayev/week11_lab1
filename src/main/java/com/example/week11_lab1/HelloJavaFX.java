package com.example.week11_lab1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloJavaFX extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Text name = new Text("Sardorbek Jumayev");
        name.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 20));

        Text studentid = new Text("Student ID: 250056");
        studentid.setFill(Color.RED);

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(name, studentid);

        StackPane root = new StackPane(vbox);

        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);
        stage.setTitle("Student Card");
        stage.show();
    }



}
