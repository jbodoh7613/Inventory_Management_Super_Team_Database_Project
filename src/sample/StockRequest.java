package sample;

public class StockRequest {
    private ProductRequest product;
    private StoreRequest store;
    private String quantity;

    // If quantity is unused, it is passed as a blank string
    public StockRequest(ProductRequest product, StoreRequest store, String quantity) {
        this.product = product;
        this.store = store;
        this.quantity = quantity;
    }
    public ProductRequest getProduct() {
        return product;
    }
    public StoreRequest getStoreRequest() {
        return store;
    }
    public String getQuantity() {
        return quantity;
    }
}
