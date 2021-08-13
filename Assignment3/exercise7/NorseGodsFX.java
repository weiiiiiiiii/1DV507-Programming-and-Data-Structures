package ww222ag_assign3.exercise7;
import java.util.ArrayList;

import javafx.application.Application;

import static javafx.application.Application.launch;

import javafx.collections.FXCollections;

import javafx.geometry.Insets;

import javafx.scene.Scene;

import javafx.scene.control.Label;

import javafx.scene.control.ListView;

import javafx.scene.layout.Border;

import javafx.scene.layout.BorderPane;

import javafx.scene.text.Font;

import javafx.scene.text.FontPosture;

import javafx.scene.text.FontWeight;

import javafx.scene.text.Text;

import javafx.scene.text.TextFlow;

import javafx.stage.Stage;

public class NorseGodsFX extends Application {

    //declaring important fields

    private ArrayList<NorseGods> gods;

    private ListView<NorseGods> listView;

    private TextFlow output;

    @Override

    public void start(Stage primaryStage) {

        //creating a border pane

        BorderPane root = new BorderPane();

        root.setPadding(new Insets(10));

        //creating a label for heading

        Label heading = new Label("Norse Gods and other Beings");

        //using custom, bigger and bold font

        heading.setFont(Font.font("Seriff", FontWeight.BOLD, 20));

        //initializing gods list

        initializeData();

        //initializing list view

        listView = new ListView<NorseGods>(FXCollections.observableArrayList(gods));

        listView.setPrefWidth(150);

        listView.setPadding(new Insets(10));

        //initializing output text flow

        output = new TextFlow();

        //using black border

        output.setStyle("-fx-border-color: black;");

        output.setPrefSize(450, 400);

        output.setPadding(new Insets(10));

        //adding heading to top, listview to left and output to center

        root.setTop(heading);

        root.setLeft(listView);

        root.setCenter(output);

        //adding mouse click listener for list view

        listView.setOnMouseClicked(e -> {

            //fetching selected god

            NorseGods god = listView.getSelectionModel().getSelectedItem();

            if (god != null) {

                //clearing output text flow

                output.getChildren().clear();

                //creating a Text object with god's name

                Text name = new Text(god.getName());

                //using custom bold font

                name.setFont(Font.font("Seriff", FontWeight.BOLD, 16));

                //repeating the same for race and description

                Text race = new Text(god.getRace());

                //using custom italic font

                race.setFont(Font.font("Seriff", FontPosture.ITALIC, 16));

                Text desc = new Text("\n" + god.getDesc());

                desc.setFont(Font.font("Seriff", FontPosture.REGULAR, 16));

                //adding to output separated by newlines

                output.getChildren().addAll(name, new Text(System.lineSeparator()), race, new Text(System.lineSeparator()), desc);

            }

        });

        //setting up and displaying a scene

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Norse Gods");

        primaryStage.show();

    }
    //method to initialize and fill gods list

    private void initializeData() {

        //initializing gods list

        gods = new ArrayList<NorseGods>();

        //adding 8 NorseGod objects.
        gods.add(new NorseGods("Odin", "Asgardian", "The king of Asgard"));

        gods.add(new NorseGods("Thor", "Asgardian", "The god of thunder and son of Odin\n"

                + "Known as the best personification of his father, Odin\n"

                + "Has the power to control lightning and summon Bifrost using Mjolnir or Stormbreaker"));

        gods.add(new NorseGods("Loki", "Asgardian", "The god of mischief and adopted son of Odin"));

        gods.add(new NorseGods("Baldr", "Asgardian", "The god of light, joy, purity"));

        gods.add(new NorseGods("Freyr", "Vanir", "The god of peace and fertility, rain, and sunshine"));

        gods.add(new NorseGods("Freyja", "Vanir", "The goddess of love, fertility, battle, and death"));

        gods.add(new NorseGods("Heimdall", "Asgardian", "The watchman of the gods"));

        gods.add(new NorseGods("Tyr", "Aesir", "The god of war"));

    }

    public static void main(String[] args) {

        launch(args);

    }

}