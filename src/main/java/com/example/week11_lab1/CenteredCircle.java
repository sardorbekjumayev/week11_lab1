package com.example.week11_lab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CenteredCircle extends Application {

    @Override
    public void start(Stage stage) throws Exception {


        Circle circle = new Circle(50);

        Pane root = new Pane(circle);

        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);
        circle.centerXProperty().bind(root.widthProperty().divide(2));
        circle.centerYProperty().bind(root.heightProperty().divide(2));



        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);
        stage.setTitle("Centered Circle");
        stage.show();
    }
}
