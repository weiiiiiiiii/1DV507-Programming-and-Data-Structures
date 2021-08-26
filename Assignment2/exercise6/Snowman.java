package ww222ag_assign2.exercise6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.geometry.Insets;



public class Snowman extends Application{

     public static void main(String[] args) {
     launch(args);
     }
         public void start(Stage primaryStage)
         {

            primaryStage.setTitle("Snowman Animation");
            Pane canvas = new Pane();
            Scene scene = new Scene(canvas, 900, 600);

            Rectangle ground = new Rectangle(0, 510, 900, 90);
               ground.setFill(Color.WHITE);
               Circle bottomcircle = new Circle(450, 450, 90, Color.WHITE);

               Circle secondcircle = new Circle(450, 320, 60, Color.WHITE);
               
               Circle button1 = new Circle(450, 350, 6, Color.BLACK);
               Circle button2 = new Circle(450, 325, 6, Color.BLACK);
               Circle button3 = new Circle(450, 300, 6, Color.BLACK);
                    
               Polygon hat = new Polygon(400.0, 200.0,500.0, 200.0,450.0, 150.0);
               //hat.getPoints().addAll(50.0, 10.0,10.0, 100.0,100.0, 100.0);           

                     
                Circle head = new Circle(450, 230, 40, Color.WHITE);
                Circle leftEye = new Circle(440, 220, 5, Color.BLUE);
                Circle rightEye = new Circle(460, 220, 5, Color.BLUE);
                Circle mouth = new Circle(450, 250, 8, Color.RED);

                Line lefthand = new Line(300,300,400,320);
                lefthand.setStrokeWidth(8.0);
                     
                Line righthand = new Line(500,320,600,300);
                 righthand.setStrokeWidth(8.0);
                     
                     
                 Circle sun = new Circle(700, 150, 60);
                 sun.setFill(Color.YELLOW);

                 primaryStage.setScene(scene);
                 canvas.getChildren().addAll(bottomcircle, ground,secondcircle,
                  head,hat, leftEye, rightEye,lefthand,righthand, sun, button1,button2,button3, mouth);


             canvas.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

             primaryStage.show();
         }

}