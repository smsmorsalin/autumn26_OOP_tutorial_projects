package main.class_object;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        int x;

        Student Morsalin ;
        Student Maruf;


        //int id, String name, LocalDate doB, String address, String dept, float cGPA)

        Morsalin = new Student(1, "Morsalin", LocalDate.now(), "Bashundhara R/A",
                "CSE");

        System.out.println(Morsalin.getId());
        System.out.println(Morsalin.getAddress());

        Morsalin.setAddress("Uttora");

        System.out.println(Morsalin.getAddress());


        System.out.println(Morsalin.toString());
        System.out.println(Morsalin.getcGPA());

        Morsalin.pay_bill(1);

    }
}
