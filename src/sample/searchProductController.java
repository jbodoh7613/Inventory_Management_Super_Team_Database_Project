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
    private TextField upcText, nameText, sectionText, typeText, brandNameText, productLineText, weightMinText, weightMaxText, lengthMinText, lengthMaxText, widthMinText, widthMaxText, heightMinText, heightMaxText, capacityMinText, capacityMaxText;
    @FXML
    private Button cancelBtn, searchBtn;
    @FXML
    private CheckBox refrigeratedCBox;

    public void cancelBtnHandler(ActionEvent e) {
        try {
            Parent menu = FXMLLoader.load(getClass().getResource("sample.fxml"));
            Stage menuStage = new Stage();
            menuStage.setScene(new Scene(menu, 350, 275));
            menuStage.setTitle("Main Menu");
            menuStage.show();
        }
        catch(IOException e928) {
            e928.printStackTrace();
        }
        ((Node)(e.getSource())).getScene().getWindow().hide();
    }
    public void searchBtnHandler(ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\resultsProduct.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 946, 488));
            stage.setTitle("Product Results");
            stage.setOnCloseRequest( el -> {
                try {
                    Parent menu = FXMLLoader.load(getClass().getResource("sample.fxml"));
                    Stage menuStage = new Stage();
                    menuStage.setScene(new Scene(menu, 350, 275));
                    menuStage.setTitle("Main Menu");
                    menuStage.show();
                }
                catch(IOException e928) {
                    e928.printStackTrace();
                }
            });
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
}