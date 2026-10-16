module com.example.combo_table_generic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.combo_table_generic to javafx.fxml;
    exports com.example.combo_table_generic;
}