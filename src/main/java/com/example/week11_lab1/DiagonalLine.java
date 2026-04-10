package com.example.week11_lab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DiagonalLine extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Line line1 = new Line(0, 0 ,0 ,0);
        line1.setStroke(Color.GREEN);
        line1.setStrokeWidth(3);

        Pane root = new Pane(line1);


        line1.endXProperty().bind(root.widthProperty());
        line1.endYProperty().bind(root.heightProperty());
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Dioganal Line");
        stage.show();
    }
}
