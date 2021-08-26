package ww222ag_assign2.exercise7;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.geometry.Insets;



public class CompoundInterest extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Compound Interest");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));


        Scene scene = new Scene(grid, 450, 250);
        primaryStage.setScene(scene);

        Label heading = new Label("Compound Interest");
        heading.setFont(new Font("Comfortaa", 42));
        grid.add(heading,0,0,2,1);
        grid.add(new Label("Start amount: "),0,1);
        TextField text1 = new TextField();
        grid.add(text1,1,1);
        grid.add(new Label("Interest:"),0,2);
        TextField text2 = new TextField();
        grid.add(text2,1,2);
        grid.add(new Label("Number of years:"),0,3);
        TextField text3 = new TextField();
        grid.add(text3,1,3);
        Label result = new Label();
        grid.add(result,0,6);

        Button calculate = new Button("Calculate");
        grid.add(calculate,0,4);
        GridPane.setHalignment(calculate,HPos.LEFT);

        calculate.setOnAction(e -> {
            if(!text1.getText().isEmpty() && !text2.getText().isEmpty() && !text3.getText().isEmpty()){
                double amount = Double.parseDouble(text1.getText());
                double Interest = Double.parseDouble(text2.getText());
                double Years = Double.parseDouble(text3.getText());
                double res = amount*Math.pow((1+(Interest/100)/1), 1*Years);
                int value = (int) Math.round(res);
                 result.setText("In total that will be: " +Integer.toString(value));
            }else {
                result.setText("Incomplete");
            }
        });
        primaryStage.show();

    }

}