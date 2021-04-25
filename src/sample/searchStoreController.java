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
import java.sql.SQLException;


public class searchStoreController {
    private SQLSearcher searcher;
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
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/sample/resultsStore.fxml"));
            Parent root = (Parent) loader.load();
            resultsStoreController resultsStoreController = loader.getController();
            try {
                searcher = new SQLSearcher("jdbc:sqlite:C:/Users/John/IdeaProjects/Inventory Management Super Team Database Project/project_database.db");
            }
            catch(SQLException es) {
                es.printStackTrace();
            }
            catch(ClassNotFoundException ec) {
                ec.printStackTrace();
            }
            resultsStoreController.setStoreRequest(store);
            resultsStoreController.setSQLSearcher(searcher);
            resultsStoreController.initTable();
            //resultsStoreController.sendStoreRequest(store);
            //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\resultsStore.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 502, 488));
            stage.setTitle("Store Results");
            stage.setOnCloseRequest( el -> {
                try {
                    searcher.disconnect();
                    Parent menu = FXMLLoader.load(getClass().getResource("sample.fxml"));
                    Stage menuStage = new Stage();
                    menuStage.setScene(new Scene(menu, 350, 275));
                    menuStage.setTitle("Main Menu");
                    menuStage.show();
                }
                catch(IOException e928) {
                    e928.printStackTrace();
                }
                catch(SQLException es) {
                    es.printStackTrace();
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