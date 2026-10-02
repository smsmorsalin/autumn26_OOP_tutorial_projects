module main.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.calculator to javafx.fxml;
    exports main.calculator;
}