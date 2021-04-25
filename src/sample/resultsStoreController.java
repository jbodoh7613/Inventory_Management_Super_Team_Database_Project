package sample;

import javafx.collections.FXCollections;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class resultsStoreController {
    private ObservableList<Store> storeList;
    private SQLSearcher searcher;
    private StoreRequest storeRequest;

    @FXML
    private Button returnBtn, editBtn, deleteBtn;
    @FXML
    private TableView<Store> storeTableView;
    @FXML
    private TableColumn<Store, Integer> storeIdCol;
    @FXML
    private TableColumn<Store, String> streetCol, cityCol, stateCol, zipCol;

    public void setStoreRequest(StoreRequest storeRequest) {
        this.storeRequest = storeRequest;
    }
    public void setSQLSearcher(SQLSearcher searcher) {
        this.searcher = searcher;
    }
    public void initTable() {
        try  {
            storeList = FXCollections.observableArrayList(searcher.searchStore(storeRequest));
            storeIdCol.setCellValueFactory(new PropertyValueFactory<>("storeId"));
            streetCol.setCellValueFactory(new PropertyValueFactory<>("street"));
            cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));
            stateCol.setCellValueFactory(new PropertyValueFactory<>("state"));
            zipCol.setCellValueFactory(new PropertyValueFactory<>("zip"));
            storeTableView.setItems(storeList);
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    public void editButtonHandler(ActionEvent e) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("\\sample\\editStore.fxml"));
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(new Scene(root, 411, 153));
            stage.setTitle("Edit Store");
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
    /* public void initialize() {
        storeList = FXCollections.observableArrayList();
        storeList.add(new Store(1, "a", "a", "a", "11111"));
        storeIdCol.setCellValueFactory(new PropertyValueFactory<>("storeId"));
        streetCol.setCellValueFactory(new PropertyValueFactory<>("street"));
        cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));
        stateCol.setCellValueFactory(new PropertyValueFactory<>("state"));
        zipCol.setCellValueFactory(new PropertyValueFactory<>("zip"));
        storeTableView.setItems(storeList);
        //storeTableView.getColumns().addAll(storeIdCol, streetCol, cityCol, stateCol, zipCol);
        //System.out.printf("%s %s %s %s\n", storeRequest.getStreet(), storeRequest.getCity(), storeRequest.getState(), storeRequest.getZip());
    } */
}
