module main.class_object {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.class_object to javafx.fxml;
    exports main.class_object;
}