package com.example.week11_lab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.*;

public class ShapesPanel extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        //shape rectangle
        Rectangle rectangle = new Rectangle(80, 60);
        rectangle.setArcWidth(20);
        rectangle.setHeight(20);
        rectangle.setFill(Color.RED);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);

        //shape Circle
        Circle circle = new Circle(40);
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        //shape Ellipse
        Ellipse ellipse = new Ellipse(50, 30);
        ellipse.setFill(Color.GREEN);
        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(2);




        HBox hbox = new HBox(20, rectangle, circle, ellipse);


        Scene scene = new Scene(hbox, 400, 200);
        stage.setScene(scene);
        stage.setTitle("Shapes");
        stage.show();
    }
}
