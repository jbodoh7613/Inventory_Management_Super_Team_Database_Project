package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;


public class addProductController {
    @FXML
    private TextField upcText, nameText, sectionText, typeText, brandNameText, productLineText, weightText, lengthText, widthText, heightText, capacityText;
    @FXML
    private Button cancelBtn, addBtn;
    @FXML
    private CheckBox refrigeratedCBox;

    public void cancelBtnHandler(ActionEvent e) {
        System.out.println("cancelBtn clicked");
    }
}
