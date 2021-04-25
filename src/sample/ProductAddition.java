package sample;

public class ProductAddition {
    private String upc, name, section, type, brandName, productLine, weight, length, width, height, capacity;
    private boolean isRefrigerated;

    // Any unused fields are passed as blank strings
    public ProductAddition(String upc, String name, String section, String type, String brandName, String productLine, String weight, String length, String width, String height, String capacity, Boolean isRefrigerated) {
        this.upc = upc;
        this.name = name;
        this.section = section;
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
    public String getUpc() {
        return upc;
    }
    public String getProductName() {
        return name;
    }
    public String getSection() {
        return section;
    }
    public String getType() {
        return type;
    }
    public String getBrandName() {
        return brandName;
    }
    public String getProductLine() {
        return productLine;
    }
    public String getWeight() {
        return weight;
    }
    public String getLength() {
        return length;
    }
    public String getWidth() {
        return width;
    }
    public String getHeight() {
        return height;
    }
    public String getCapacity() {
        return capacity;
    }
    public Boolean isRefrigerated() {
        return isRefrigerated;
    }
}
