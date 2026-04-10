package com.example.week11_lab1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ProfileCard extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        //top section
        Label sname = new Label("Sardorbek Jumayev");
        sname.setTextFill(Color.WHITE);
        sname.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));
        sname.setStyle("-fx-background-color: #2C3E50;");
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(12));
        hBox.getChildren().add(sname);

        //center section
        Text department = new Text("Department: ");
        Text year = new Text("Year: ");
        Text gpa = new Text("GPA: ");


        Text departmentval = new Text("Computer science");
        Text yearval = new Text("2025");
        Text gpaval = new Text("3.5");

        GridPane gridPane = new GridPane();
        gridPane.add(department, 1, 1);
        gridPane.add(year, 1, 2);
        gridPane.add(gpa, 1, 3);

        gridPane.add(departmentval, 2 ,1);
        gridPane.add(yearval, 2, 2);
        gridPane.add(gpaval, 2, 3);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20));



        //bottom section
        Label university = new Label("New Uzbekistan University");
        university.setAlignment(Pos.CENTER);
        university.setPadding(new Insets(8));
        university.setStyle("-fx-background-color: #ECF0F1; -fx-font-size: 13;");


        BorderPane borderPane = new BorderPane();
        borderPane.setTop(hBox);
        borderPane.setCenter(gridPane);
        borderPane.setBottom(university);


        Scene scene = new Scene(borderPane, 400, 250);
        stage.setScene(scene);
        stage.setTitle("Profile Card");
        stage.show();

    }
}
