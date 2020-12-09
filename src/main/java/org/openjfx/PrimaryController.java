package org.openjfx;

import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class PrimaryController implements Initializable {

    class Person {
        String pDate;
        String pName;
        String pComp;
        String pColor;

        public Person(String personDate, String personName, String personCompany, String personColor) {
            pDate = personDate;
            pName = personName;
            pComp = personCompany;
            pColor = personColor;
        }

        public String getPersonName() {
            return pName;
        }
        public String getPersonColor() {
            return pColor;
        }
    }

    ArrayList<String> rawData = new ArrayList<String>();
    public static Map<String, List<String>> empColor = new HashMap<>();
    public static ArrayList<Person> empObj = new ArrayList<Person>();

    public void singleFileChooser(MouseEvent mouseEvent) throws IOException {
        App.setRoot("secondary");
        //prompt user to select file
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);
        //pass file path to access file
        BufferedReader reader = new BufferedReader(
                new FileReader(new File((selectedFile.getAbsolutePath()))));

        // read file line by line and save the lines containing text as Strings in arrayList
        String text;
        while ((text = reader.readLine()) != null) {
            // skip the blank lines
            if (text.trim().length() == 0) {
                continue;
            } else {
                //Split the line in half at the ":" character.
                String[] parts = text.split(":");
                String part2 = parts[1];
                //Add the part of the String we want (name, date, company, color).
                rawData.add(part2);
            }
        }

        //process the array of Strings rawData and organize them into employee objects
        for (int i = 0; i < rawData.size(); i++) {
            String date = "";
            String name = "";
            String comp = "";
            String color = "";

            date = rawData.get(i);
            i++;

            name = rawData.get(i);
            i++;

            comp = rawData.get(i);
            i++;

            color = rawData.get(i);
            // adding each employee object to the list.
            empObj.add(new Person(date, name, comp, color));
        }

        // Create a HashMap to map color with employee names
        for (Person Person : empObj) {
            //check to see if the employee color is currently a key in the hashmap
            if (!empColor.containsKey((Person.getPersonColor()))) {
                //add the arraylist for the employee color
                empColor.put((Person.getPersonColor()), new ArrayList<String>());
            }
            //add the employee name to the color arraylist
            empColor.get(Person.getPersonColor()).add(Person.getPersonName());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}