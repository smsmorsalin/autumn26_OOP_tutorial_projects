package com.example.combo_table_generic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("combo_table.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


//        String x = "ABCD";
//        System.out.println(x.isEmpty());

        ArrayList<Integer> lst1 = new ArrayList<Integer>();
        lst1.add(1);
        lst1.add(5);
        lst1.add(10);

        // 1, 5, 10

        for(Integer i: lst1){
            System.out.println(i + 1);
        }




    }
}
