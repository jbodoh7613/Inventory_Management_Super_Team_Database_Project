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
        StoreRequest store = new StoreRequest(streetText.getText(), cityText.getText(), stateText.getText(), zipText.getText());
        try {
            //FXMLLoader loader = new FXMLLoader(getClass().getResource("\\sample\\resultsStore.fxml"));
            //Parent root = (Parent) loader.load();
            //resultsStoreController resultsStoreController = loader.getController();
            //resultsStoreController.sendStoreRequest(store);
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\resultsStore.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 502, 488));
            stage.setTitle("Store Results");
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