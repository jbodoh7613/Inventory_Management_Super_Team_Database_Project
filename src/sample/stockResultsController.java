package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class stockResultsController {
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
