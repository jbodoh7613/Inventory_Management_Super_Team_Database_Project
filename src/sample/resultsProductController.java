package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class resultsProductController {
    private ObservableList<Product> productList;
    @FXML
    private Button returnBtn, editBtn, deleteBtn;
    @FXML
    private TableView<Product> productTableView;
    @FXML
    private TableColumn<Product, Integer> productIdCol, upcCol, capacityCol;
    @FXML
    private TableColumn<Product, String> sectionCol, typeCol, brandNameCol, productLineCol, weightCol, lengthCol, widthCol, heightCol;
    @FXML
    private TableColumn<Product, Boolean> refrigeratedCol;

    public void editBtnHandler(ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\editProduct.fxml"));
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root, 411, 407));
            stage.setTitle("Edit Product");
            stage.show();
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
    public void initialize() {

    }
}
