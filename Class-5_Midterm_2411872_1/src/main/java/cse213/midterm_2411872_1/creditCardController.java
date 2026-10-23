package cse213.midterm_2411872_1;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class creditCardController
{
    @javafx.fxml.FXML
    private TableColumn<CreditCard, String> tableColGatewayName;
    @javafx.fxml.FXML
    private TextField cardLimitTFFilter;
    @javafx.fxml.FXML
    private TextField holderNameTF;
    @javafx.fxml.FXML
    private TableView<CreditCard> tableView;
    @javafx.fxml.FXML
    private TableColumn<CreditCard, String> tableColCardNo;
    @javafx.fxml.FXML
    private ComboBox<String> gatwayNameComboBoxFilter;
    @javafx.fxml.FXML
    private TableColumn<CreditCard, Float> tableColCardLimit;
    @javafx.fxml.FXML
    private Label avgLabel;
    @javafx.fxml.FXML
    private TextField cardLimitTF;
    @javafx.fxml.FXML
    private DatePicker ExpDateDP;
    @javafx.fxml.FXML
    private ComboBox<String> cardTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<CreditCard, String> tableColHolderName;
    @javafx.fxml.FXML
    private ComboBox<String> gatewayNameComboBox;
    @javafx.fxml.FXML
    private TextField cardNoTF;

    ArrayList<CreditCard> cardList;

    @javafx.fxml.FXML
    public void initialize() {
        cardList = new ArrayList<CreditCard>();

        gatewayNameComboBox.getItems().addAll("Visa", "MasterCard");
        cardTypeComboBox.getItems().addAll("Silver", "Gold", "platinum", "titanium");
        gatwayNameComboBoxFilter.getItems().addAll("Visa", "MasterCard");

        tableColCardNo.setCellValueFactory(new PropertyValueFactory<CreditCard, String>("cardNo"));
        tableColHolderName.setCellValueFactory(new PropertyValueFactory<CreditCard, String>("holderName"));
        tableColGatewayName.setCellValueFactory(new PropertyValueFactory<CreditCard, String>("gatewayName"));
        tableColCardLimit.setCellValueFactory(new PropertyValueFactory<CreditCard, Float>("creditLimit"));
    }

    @javafx.fxml.FXML
    public void showAverageCreditLImitFromLoadedTableViewButtonOA(ActionEvent actionEvent) {
        int counter = 0;
        Float sum = 0f;
        for(CreditCard X: tableView.getItems()){
            sum += X.getCreditLimit();
            counter ++;
        }

        Float avg = sum/counter;

        avgLabel.setText("Avg: " + avg);
    }

    @javafx.fxml.FXML
    public void searchAndLoadTableButtonOA(ActionEvent actionEvent) {
        for(CreditCard C: cardList){
            if(gatwayNameComboBoxFilter.getValue().equals(C.getGatewayName()) && Float.parseFloat(cardLimitTFFilter.getText()) <= C.getCreditLimit()){
                tableView.getItems().add(C);
            }

        }
    }

    @javafx.fxml.FXML
    public void validateAndAddNewCardToArrayListButtonOA(ActionEvent actionEvent) {
        //validation part
        char GatewayNo = '0';
        if ((gatewayNameComboBox.getValue().equals("Visa"))){
            GatewayNo = '4';
        } else if ((gatewayNameComboBox.getValue().equals("MasterCard"))) {
            GatewayNo = '5';
        }
        if(cardNoTF.getText().length() != 16 || (cardNoTF.getText().charAt(0) != GatewayNo) ){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("error: card number must be 16 len refering to gateway number visa = 4, mastercard = 5");
            a.showAndWait();
            return;
        }


        //        String cardNo, String holderName, LocalDate dateOfExpiry, String gatewayName,
        //        float creditLimit, String cardType
        cardList.add(new CreditCard(
                cardNoTF.getText(), holderNameTF.getText(),
                ExpDateDP.getValue(), gatewayNameComboBox.getValue(),
                Float.parseFloat(cardLimitTF.getText()), cardTypeComboBox.getValue()
        ));
    }
}