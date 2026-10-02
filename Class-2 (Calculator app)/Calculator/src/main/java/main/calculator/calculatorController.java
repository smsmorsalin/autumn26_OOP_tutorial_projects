package main.calculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calculatorController
{
    @javafx.fxml.FXML
    private TextField number2TF;
    @javafx.fxml.FXML
    private TextField number1TF;
    @javafx.fxml.FXML
    private Label resultLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void sumButttonOA(ActionEvent actionEvent) {

        int num1 = Integer.parseInt(number1TF.getText());
        int num2 = Integer.parseInt(number2TF.getText());

        int sum = num1 + num2;

        resultLabel.setText("Result--> " + sum);

    }

    @javafx.fxml.FXML
    public void subButtonOA(ActionEvent actionEvent) {

        int num1 = Integer.parseInt(number1TF.getText());
        int num2 = Integer.parseInt(number2TF.getText());

        int sub = num1 - num2;

        resultLabel.setText("Result --> " + sub);
    }
}