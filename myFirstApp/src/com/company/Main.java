package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        //first example, sets up a simple stage
       /* primaryStage.setTitle("Hello adventurer!"); // window name

        final Button btn = new Button(); //use the fx not awt button
        btn.setText("Click Me!"); // this makes a button with text

        final StackPane root = new StackPane();
        root.getChildren().add(btn);

        primaryStage.setScene (new Scene(root, 300, 250)); //sets a new stage scene with specific dimensions
        primaryStage.show(); */

 //multiple window use
      /*
        //first window
       Scene scene = new Scene( new Button("The First Button"),200,250); //if scene size isnt set, window size = button size
            primaryStage.setTitle("It's a stage!");
            primaryStage.setScene(scene);
            primaryStage.show();
        //second window
            Stage secStage = new Stage();
            secStage.setTitle("Another stage!");
            Scene scene2 = new Scene(new Button("Other Button"), 200, 200);
            secStage.setScene(scene2);
            secStage.show();
        */

//makes a circle inside of a stage
      /*
        final Circle c = new Circle();
      c.setCenterX(100);
      c.setCenterY(100);
      c.setRadius(50.0);
      c.setStroke(Color.BLACK);
      c.setFill(Color.BLUE);

      Pane pane = new Pane();
      pane.getChildren().add(c);

      Scene scene = new Scene( pane, 200, 200); // resizing the window the circle does not move due to property binding
      primaryStage.setTitle("A circle");
      primaryStage.setScene(scene);
      primaryStage.show();
      */

// setting up a grid pane
        /*
       primaryStage.setTitle("Password Box");

        GridPane grid = new GridPane();
        grid.setGridLinesVisible(true);
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text ("Valencia College");
        sceneTitle.setFont(Font.font("Comic Sans", FontWeight.NORMAL, 20));
        grid.add(sceneTitle,0,0,2,1);

        //user info
        Label userName = new Label("Username");
        grid.add(userName, 0 ,1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        //password info
        Label pw = new Label("Password");
        grid.add(pw, 0 ,2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Scene scene = new Scene( grid, 300, 275);
        primaryStage.setTitle("A circle");
        primaryStage.setScene(scene);
        primaryStage.show();
        */

       

    }
}