package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class  editStoreController {
    @FXML
    TextField streetText, cityText, stateText, zipText;
    @FXML
    private Button cancelBtn, editBtn;

    public void cancelBtnHandler(ActionEvent e) {
        ((Node) (e.getSource())).getScene().getWindow().hide();
    }
    public void editBtnHandler(ActionEvent e) {
        ((Node) (e.getSource())).getScene().getWindow().hide();
    }
}