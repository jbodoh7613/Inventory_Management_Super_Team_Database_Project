package sample;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException ;
import java.sql.Statement ;
import java.sql.ResultSet ;
import java.sql.PreparedStatement;
import javafx.collections.ObservableList;

public class SQLSearcher {
    private Connection connection;

    public SQLSearcher(String url) throws SQLException, ClassNotFoundException {
        connection = DriverManager.getConnection(url);
    }
    public ObservableList<Product> searchProduct(ProductRequest product) {

    }
    public static
}
