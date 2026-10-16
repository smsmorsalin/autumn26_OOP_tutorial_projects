package com.example.combo_table_generic;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class combo_tableController
{
    @javafx.fxml.FXML
    private TableView<forTable> tableView;
    @javafx.fxml.FXML
    private TableColumn<forTable, Integer> tableCol_SL;
    @javafx.fxml.FXML
    private TableColumn<forTable, String> tableCol_Name;
    @javafx.fxml.FXML
    private ComboBox<String> comboBox;    //male, female
    @javafx.fxml.FXML
    private TableColumn<forTable, String> tableCol_Phone;

    @javafx.fxml.FXML
    public void initialize() {

        comboBox.getItems().addAll("Male", "Female");




    }}