package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class resultsProductController {
    @FXML
    private Button returnBtn, editBtn, deleteBtn;

    public void editBtnHandler(ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\editProduct.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 411, 407));
            stage.setTitle("Edit Product");
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
    public void returnBtnHandler(ActionEvent e) {
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
}
