package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class addStoreController {
    @FXML
    private TextField streetText, cityText, stateText, zipText;
    @FXML
    private Button cancelBtn, addBtn;

    public void cancelBtnHandler(ActionEvent e) {
        System.out.println("cancelBtn clicked");
    }
}