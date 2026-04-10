package com.example.week11_lab1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorMixer extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        double R = 0.3, G = 0.6, B = 0.2;
        Rectangle rectangle = new Rectangle(200, 200);
        Color color = new Color(R, G, B, 1);
        rectangle.setFill(color);

        Text rcolor = new Text("R: 0.3");
        Text gcolor = new Text("G: 0.6");
        Text bcolor = new Text("B: 0.2");

        Text hexcolor = new Text("#3A7FCC");

        VBox vbox = new VBox(10, rectangle, rcolor, gcolor, bcolor, hexcolor);
        vbox.setSpacing(8);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vbox, 400, 400);
        stage.setScene(scene);
        stage.setTitle("Color Mixer");
        stage.show();




    }
}
