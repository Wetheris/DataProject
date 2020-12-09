package org.openjfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.Random;

public class SecondaryController {
    @FXML
    public TextArea textArea1;
    public ImageView imgImage;
    public Button openGreen;
    public Button openYellow;
    public Button openViolet;
    public Button openIndigo;
    public Button openOrange;
    public Button openRed;
    public Button openBlue;
@FXML
    VBox VBox1 = new VBox();
        //set TextArea to list employees names with each color that corresponds to the button pressed
    public void openGreen(MouseEvent mouseEvent) {
        VBox1.setStyle("-fx-background-color : #006400");
        textArea1.setText("");
        openGreen.setStyle("-fx-background-color: #006400");
        List<String> stuff = PrimaryController.empColor.get("green");
        for (int i = 0; i < stuff.size(); i++) {
            textArea1.appendText(stuff.get(i) + "\n");
        }
    }

    public void openYellow(MouseEvent mouseEvent) {
        VBox1.setStyle("-fx-background-color : #FFFF00");
        textArea1.setText("");
        openYellow.setStyle("-fx-background-color: #FFFF00");
        List<String> stuff = PrimaryController.empColor.get("yellow");
        for (int i = 0; i < stuff.size(); i++) {
            textArea1.appendText(stuff.get(i) + "\n");
        }
    }

    public void openViolet(MouseEvent mouseEvent) {
        VBox1.setStyle("-fx-background-color : #EE82EE");
        textArea1.setText("");
        openViolet.setStyle("-fx-background-color: #EE82EE");
        List<String> stuff = PrimaryController.empColor.get("violet");
        for (int i = 0; i < stuff.size(); i++) {
            textArea1.appendText(stuff.get(i) + "\n");
        }
    }

    public void openIndigo(MouseEvent mouseEvent) {
        VBox1.setStyle("-fx-background-color : #4B0082");
        textArea1.setText("");
        openIndigo.setStyle("-fx-background-color: #4B0082");
        List<String> stuff = PrimaryController.empColor.get("indigo");
        for (int i = 0; i < stuff.size(); i++) {
            textArea1.appendText(stuff.get(i) + "\n");
        }
    }

    public void openOrange(MouseEvent mouseEvent) {
        VBox1.setStyle("-fx-background-color : #FFA500");
        textArea1.setText("");
        openOrange.setStyle("-fx-background-color: #FFA500");
        List<String> stuff = PrimaryController.empColor.get("orange");
        for (int i = 0; i < stuff.size(); i++) {
            textArea1.appendText(stuff.get(i) + "\n");
        }
    }

    public void openRed(MouseEvent mouseEvent) {
        VBox1.setStyle("-fx-background-color : #FF0000");
        textArea1.setText("");
        openRed.setStyle("-fx-background-color: #FF0000");
        List<String> stuff = PrimaryController.empColor.get("red");
        for (int i = 0; i < stuff.size(); i++) {
            textArea1.appendText(stuff.get(i) + "\n");
        }
    }

    public void openBlue(MouseEvent mouseEvent) {
        VBox1.setStyle("-fx-background-color : #0000FF");
        textArea1.setText("");
        textArea1.setStyle("-fx-background-color: #0000FF");
        List<String> stuff = PrimaryController.empColor.get("blue");
        for (int i = 0; i < stuff.size(); i++) {
            textArea1.appendText(stuff.get(i) + "\n");
        }
    }

    //displays a random employee and a random picture
    public void btnEmployee(MouseEvent mouseEvent) {
        Random rand = new Random();
        // Obtain a random employee
        int n = rand.nextInt(PrimaryController.empObj.size());
        //display a random person
        Image playI=new Image("https://thispersondoesnotexist.com/image");
        imgImage.setImage(playI);
        //display a random employee name
        textArea1.setText(PrimaryController.empObj.get(n).getPersonName());
        }
    }