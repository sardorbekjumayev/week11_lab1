package com.example.week11_lab1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class LayoutExplorer extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane root = new BorderPane();

        /*      TOP SECTION START     */
        Button file = new Button("file");
        Button save = new Button("save");
        Button cancel = new Button("cancel");

        HBox hbox = new HBox(10, file, save, cancel);
        hbox.setPadding(new Insets(10));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: gold;");




        /*      LEFT SECTION START     */
        Label label = new Label("Courses");
        Label cs101 = new Label("CS101");
        Label cs201 = new Label("CS201");
        Label cs221 = new Label("CS221");
        Label cs301 = new Label("CS301");

        VBox vbox = new VBox(10, label, cs101, cs201, cs221, cs301);
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(8);


        /*      CENTER SECTION START     */

        Label fname = new Label("Frist name:");
        TextField fnamefield = new TextField();

        Label lname = new Label("Last name:");
        TextField lnamefield = new TextField();

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setPadding(new Insets(10));

        gridPane.add(fname, 1,1);
        gridPane.add(fnamefield, 1,2);

        gridPane.add(lname, 1,3);
        gridPane.add(lnamefield, 1,4);

        root.setTop(hbox);
        root.setLeft(vbox);
        root.setCenter(gridPane);

        Scene scene = new Scene(root,450, 300);
        stage.setScene(scene);
        stage.setTitle("Layout Explorer");
        stage.show();
    }
}
