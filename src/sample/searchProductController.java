package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class searchProductController {
    @FXML
    private TextField upcText, nameText, sectionText, typeText, brandNameText, productLineText, weightText, lengthText, widthText, heightText, capacityText;
    @FXML
    private Button cancelBtn, searchBtn;
    @FXML
    private CheckBox refrigeratedCBox;

    public void cancelBtnHandler(ActionEvent e) {
        System.out.println("cancelBtn clicked");
    }
    public void searchBtnHandler(ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\resultsProduct.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 946, 488));
            stage.setTitle("Product Results");
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
}