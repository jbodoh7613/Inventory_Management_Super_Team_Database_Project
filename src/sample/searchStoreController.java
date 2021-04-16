package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class searchStoreController {
    @FXML
    private TextField streetText, cityText, stateText, zipText;
    @FXML
    private Button cancelBtn, searchBtn;

    public void cancelBtnHandler(ActionEvent e) {
        System.out.println("cancelBtn clicked");
    }
    public void searchBtnHandler(ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\resultsStore.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 502, 488));
            stage.setTitle("Store Results");
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
}