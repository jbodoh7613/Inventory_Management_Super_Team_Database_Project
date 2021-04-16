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

public class Controller {
    @FXML
    private Button addProdBtn, viewProdBtn, addStoreBtn, viewStoreBtn, addStockBtn, viewStockBtn;

    public void addProdBtnHandler(ActionEvent e) {
        System.out.println("addProdBtn clicked");
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\addProduct.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 411, 407));
            stage.setTitle("Add Product");
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
    public void viewProdBtnHandler(ActionEvent e) {
        System.out.println("viewProdBtn clicked");
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\searchProduct.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 411, 407));
            stage.setTitle("Search for Product");
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
    public void addStoreBtnHandler(ActionEvent e) {
        System.out.println("addStoreBtn clicked");
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\addStore.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 411, 153));
            stage.setTitle("Add Store");
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
    public void viewStoreBtnHandler(ActionEvent e) {
        System.out.println("viewStoreBtn clicked");
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\searchStore.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 411, 153));
            stage.setTitle("Search for Store");
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
    public void addStockBtnHandler(ActionEvent e) {
        System.out.println("addStockBtn clicked");
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\addStock.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 822, 407));
            stage.setTitle("Add Stock");
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
    public void viewStockBtnHandler(ActionEvent e) {
        System.out.println("viewStockBtn clicked");
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\searchStock.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(root, 822, 407));
            stage.setTitle("Search Stock");
            stage.show();
            ((Node)(e.getSource())).getScene().getWindow().hide();
        }
        catch (IOException ei) {
            ei.printStackTrace();
        }
    }
}
