package sample;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.Statement ;
import java.sql.ResultSet ;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.ObservableList;

public class SQLSearcher {
    private Connection connection;

    public SQLSearcher(String url) throws SQLException, ClassNotFoundException {
        connection = DriverManager.getConnection(url);
    }
    private String createProductSearchString(ProductRequest product) {
        StringBuilder searchString = new StringBuilder("SELECT * FROM Products WHERE ");
        boolean hasPreviousCondition = false;
        if(!product.getUpc().equals("")) {
            searchString.append("upc = " + product.getUpc());
            hasPreviousCondition = true;
        }
        if(!product.getProductName().equals("")){
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("pname = '" + product.getProductName() + "'");
            hasPreviousCondition = true;
        }
        if(!product.getSection().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("section = '" + product.getSection() + "'");
            hasPreviousCondition = true;
        }
        if(!product.getType().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("ptype = '" + product.getType() + "'");
            hasPreviousCondition = true;
        }
        if(!product.getBrandName().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("brandname = '" + product.getBrandName() + "'");
            hasPreviousCondition = true;
        }
        if(!product.getProductLine().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("productline = '" + product.getProductLine() + "'");
            hasPreviousCondition = true;
        }
        if(!product.getWeightMin().equals("") ^ !product.getWeightMax().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            if(!product.getWeightMin().equals("")) {
                searchString.append("weight = " + product.getWeightMin());
            }
            else {
                searchString.append("weight = " + product.getWeightMax());
            }
            hasPreviousCondition = true;
        }
        if(!product.getWeightMin().equals("") && !product.getWeightMax().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("weight BETWEEN " + product.getWeightMin() + " AND " + product.getWeightMax());
            hasPreviousCondition = true;
        }
        if(!product.getLengthMin().equals("") ^ !product.getLengthMax().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            if(!product.getLengthMin().equals("")) {
                searchString.append("length = " + product.getLengthMin());
            }
            else {
                searchString.append("length = " + product.getLengthMax());
            }
            hasPreviousCondition = true;
        }
        if(!product.getLengthMin().equals("") && !product.getLengthMax().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("length BETWEEN " + product.getLengthMin() + " AND " + product.getLengthMax());
            hasPreviousCondition = true;
        }
        if(!product.getWidthMin().equals("") ^ !product.getWidthMax().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            if(!product.getWidthMin().equals("")) {
                searchString.append("width = " + product.getWidthMin());
            }
            else {
                searchString.append("width = " + product.getWidthMax());
            }
            hasPreviousCondition = true;
        }
        if(!product.getWidthMin().equals("") && !product.getWidthMax().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("width BETWEEN " + product.getWidthMin() + " AND " + product.getWidthMax());
            hasPreviousCondition = true;
        }
        if(!product.getHeightMin().equals("") ^ !product.getHeightMax().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            if(!product.getHeightMin().equals("")) {
                searchString.append("height = " + product.getHeightMin());
            }
            else {
                searchString.append("height = " + product.getHeightMax());
            }
            hasPreviousCondition = true;
        }
        if(!product.getHeightMin().equals("") && !product.getHeightMax().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("height BETWEEN " + product.getHeightMin() + " AND " + product.getHeightMax());
            hasPreviousCondition = true;
        }
        if(!product.getCapacityMin().equals("") ^ !product.getCapacityMax().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            if(!product.getCapacityMin().equals("")) {
                searchString.append("capacity = " + product.getCapacityMin());
            }
            else {
                searchString.append("capacity = " + product.getCapacityMax());
            }
            hasPreviousCondition = true;
        }
        if(!product.getCapacityMin().equals("") && !product.getCapacityMax().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("capacity BETWEEN " + product.getCapacityMin() + " AND " + product.getCapacityMax());
            hasPreviousCondition = true;
        }
        if(!product.isRefrigerated()) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("isrefrigerated = 0");
            // Do not set hasPreviousCondition as isRefrigerated is last attribute checked
        }
        if(product.isRefrigerated()) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            searchString.append("isrefrigerated = 1");
            // Do not set hasPreviousCondition as isRefrigerated is last attribute checked
        }
        searchString.append(" LIMIT 20;");
        return searchString.toString();
    }
    private String createStoreSearchString(StoreRequest store) {
        StringBuilder searchString = new StringBuilder ("SELECT * FROM Stores");
        boolean hasPreviousCondition = false;
        if(!store.getStreet().equals("")) {
            searchString.append(" WHERE address_street = '" + store.getStreet() + "'");
            hasPreviousCondition = true;
        }
        if(!store.getCity().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            else {
                searchString.append(" WHERE ");
            }
            searchString.append("address_city = '" + store.getCity() + "'");
            hasPreviousCondition = true;
        }
        if(!store.getState().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            else {
                searchString.append(" WHERE ");
            }
            searchString.append("address_state = '" + store.getState() + "'");
            hasPreviousCondition = true;
        }
        if(!store.getZip().equals("")) {
            if(hasPreviousCondition) {
                searchString.append(" AND ");
            }
            else {
                searchString.append(" WHERE ");
            }
            searchString.append("address_zip = '" + store.getZip() + "'");
            // Do not set hasPreviousCondition as zip is last attribute checked
        }
        searchString.append(" LIMIT 20;");
        return searchString.toString();
    }
    public List<Product> searchProduct(ProductRequest product) throws SQLException {
        List<Product> productList = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(createProductSearchString(product));
        while(results.next()) {
            int productId = results.getInt("productid");
            int upc = results.getInt("upc");
            String name = results.getString("pname");
            String section = results.getString("section");
            String type = results.getString("ptype");
            String brandName = results.getString("brandname");
            String productLine = results.getString("productline");
            double weight = results.getDouble("weight");
            double length = results.getDouble("length");
            double width = results.getDouble("width");
            double height = results.getDouble("height");
            int capacity = results.getInt("capacity");
            boolean isRefrigerated = results.getBoolean("isrefrigerated");
            productList.add(new Product(productId, upc, name, section, type, brandName, productLine, weight, length, width, height, capacity, isRefrigerated));
        }
        return productList;
    }
    public List<Store> searchStore(StoreRequest store) throws SQLException {
        List<Store> storeList = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery(createStoreSearchString(store));
        while(results.next()) {
            int storeId = results.getInt("storeid");
            String street = results.getString("address_street");
            String city = results.getString("address_city");
            String state = results.getString("address_state");
            String zip = results.getString("address_zip");
            storeList.add(new Store(storeId, street, city, state, zip));
        }
        return storeList;
    }
    public void disconnect() throws SQLException {
        if(connection != null) {
            connection.close();
        }
    }
}
