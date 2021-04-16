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

public class resultsStoreController {
    @FXML
    private Button returnBtn, editBtn, deleteBtn;

    public void editButtonHandler(ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\editStore.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 411, 153));
            stage.setTitle("Edit Store");
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
}
