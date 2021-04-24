package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class editProductController {
    @FXML
    TextField upcText, nameText, sectionText, brandNameText, productLineText, weightText, lengthText, widthText, heightText, capacityText;
    @FXML
    CheckBox refrigeratedCBox;
    @FXML
    Button cancelBtn, editBtn;

    public void cancelBtnHandler(ActionEvent e) {
        ((Node) (e.getSource())).getScene().getWindow().hide();
    }
    public void editBtnHandler(ActionEvent e) {
        ((Node) (e.getSource())).getScene().getWindow().hide();
    }
}
