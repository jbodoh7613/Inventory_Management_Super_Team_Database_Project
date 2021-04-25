package sample;

public class Product {
    String prodName, section, type, brandName, productLine;
    double weight, length, width, height;
    int productId, upc, capacity;
    boolean isRefrigerated;
    Product(int storeId, int upc, String prodName, String section, String type, String brandName, String productLine, double weight, double length, double width, double height, int capacity, boolean isRefrigerated) {
        this.upc = upc;
        this.prodName = prodName;
        this.section = section;
        this.type = type;
        this.brandName = brandName;
        this.productLine = productLine;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.capacity = capacity;
        this.isRefrigerated = isRefrigerated;
    }

    public int getProductId() {
        return productId;
    }
    public void setProductId() {
        this.productId = productId;
    }
    public int getUpc() {
        return upc;
    }
    public void setUpc(int upc) {
        this.upc = upc;
    }
    public String getProdName() {
        return prodName;
    }
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public String getSection(String section) {
        return section;
    }
    public void setSection(String section) {
        this.section = section;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    public String getProductLine() {
        return productLine;
    }
    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public boolean isRefrigerated() {
        return isRefrigerated;
    }
    public void setRefrigerated(boolean isRefrigerated) {
        this.isRefrigerated = isRefrigerated;
    }
}