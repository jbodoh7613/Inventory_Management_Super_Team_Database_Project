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
import java.sql.SQLException;


public class searchProductController {
    private SQLSearcher searcher;
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
        ProductRequest product = new ProductRequest(upcText.getText(), nameText.getText(), sectionText.getText(), typeText.getText(), brandNameText.getText(), productLineText.getText(), weightMinText.getText(), weightMaxText.getText(), lengthMinText.getText(), lengthMaxText.getText(), widthMinText.getText(), widthMaxText.getText(), heightMinText.getText(), heightMaxText.getText(), capacityMinText.getText(), capacityMaxText.getText(), refrigeratedCBox.isSelected());
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("/sample/resultsProduct.fxml"));
            Parent root = (Parent) loader.load();
            resultsProductController resultsProductController = loader.getController();
            try {
                searcher = new SQLSearcher("jdbc:sqlite:C:/Users/John/IdeaProjects/Inventory Management Super Team Database Project/project_database.db");
            }
            catch(SQLException es) {
                es.printStackTrace();
            }
            catch(ClassNotFoundException ec) {
                ec.printStackTrace();
            }
            resultsProductController.setProductRequest(product);
            resultsProductController.setSQLSearcher(searcher);
            resultsProductController.initTable();
            //Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("/sample/resultsProduct.fxml"));
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