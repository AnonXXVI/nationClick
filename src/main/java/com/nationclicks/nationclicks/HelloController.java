package com.nationclicks.nationclicks;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.HashMap;

public class HelloController {

    @FXML
    private Rectangle section1;
    @FXML
    private Rectangle secondSection;
    @FXML
    private Rectangle thirdSection;


    public  static  final double width = 341.0f;
    public static final double height = 84.0f;

     void createFlag(Color color1,Color color2,Color color3, double w, double h){
         section1.setFill(color1);
         section1.setWidth(w);
         section1.setHeight(h);

         secondSection.setFill(color2);
         secondSection.setWidth(w);
         secondSection.setHeight(h);

         thirdSection.setFill(color3);
         thirdSection.setWidth(w);
         thirdSection.setHeight(h);
    }


    //hashmap method to return key
    public static <k, V> V getValueFromHash(HashMap<k,V> map, k key){
         return map.get(key);
    }

    //get color using hashmap method from above
    public Color getColor(String colorName){
        HashMap<String, Color> colors = new HashMap<>();
        colors.put("red", Color.RED);
        colors.put("white", Color.WHITE);
        colors.put("blue",Color.BLUE);
        colors.put("defaultColor",Color.web("#1e90ff"));
        colors.put("yellow", Color.YELLOW);
        colors.put("sky",Color.SKYBLUE);
        colors.put("green",Color.GREEN);

        return getValueFromHash(colors,colorName);
    }


    //display lesotho flag
    public void setLesotho(ActionEvent event){
        createFlag(getColor("blue"),getColor("white"),getColor("green"),width,height);
    }

    //display russian flag
    public void setRussia(ActionEvent event){
        createFlag(Color.WHITE,Color.BLUE,Color.RED,width,height);
    }

    //method to clear flag
    public void clear(ActionEvent event){
        section1.setFill(getColor("defaultColor"));
        secondSection.setFill(getColor("defaultColor"));
        thirdSection.setFill(getColor("defaultColor"));
    }


    //display ukrainian flag
    public void setUkraine(ActionEvent event){
        section1.setWidth(width);
        section1.setHeight(height);
        section1.setFill(getColor("defaultColor"));

        secondSection.setFill(getColor("defaultColor"));
        secondSection.setHeight(126.0f);
        secondSection.setWidth(width);

        thirdSection.setFill(Color.YELLOW);
        thirdSection.setWidth(width);
        thirdSection.setHeight(70.0f);

       // createFlag(Color.web("#1e90ff"),Color.web("#1e90ff"),Color.YELLOW,);

    }

    //show Garbonian flag
    public void showGar(ActionEvent event){
        createFlag(Color.web("#55e448"),Color.YELLOW,Color.SKYBLUE,width,height);
    }

    //show flag of argentina
    public void showArg(ActionEvent event){
         createFlag(Color.web("#26aad7"),Color.WHITE,Color.web("#26aad7"),width,height);
    }


    //exit application
    public void exit(ActionEvent event){
        Alert alertBox = new Alert(Alert.AlertType.CONFIRMATION);
        alertBox.setTitle("Quit");
        alertBox.setContentText("Are You Sure You Want To Quit?");
        alertBox.showAndWait();
        Platform.exit();
    }

}