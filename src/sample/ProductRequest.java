package sample;

public class ProductRequest {
    private String upc, name, section, type, brandName, productLine, weightMin, weightMax, lengthMin, lengthMax, widthMin, widthMax, heightMin, heightMax, capacityMin, capacityMax;
    private boolean isRefrigerated;

    // Any unused fields are passed as blank strings
    public ProductRequest(String upc, String name, String section, String type, String brandName, String productLine, String weightMin, String weightMax, String lengthMin, String lengthMax, String widthMin, String widthMax, String heightMin, String heightMax, String capacityMin, String capacityMax, Boolean isRefrigerated) {
        this.upc = upc;
        this.name = name;
        this.section = section;
        this.section = section;
        this.type = type;
        this.brandName = brandName;
        this.productLine = productLine;
        this.weightMin = weightMin;
        this.weightMax = weightMax;
        this.lengthMin = lengthMin;
        this.lengthMax = lengthMax;
        this.widthMin = widthMin;
        this.widthMax = widthMax;
        this.heightMin = heightMin;
        this.heightMax = heightMax;
        this.capacityMin = capacityMin;
        this.capacityMax = capacityMin;
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
    public String getWeightMin() {
        return weightMin;
    }
    public String getWeightMax() { return weightMax; }
    public String getLengthMin() {
        return lengthMin;
    }
    public String getLengthMax() { return lengthMax; }
    public String getWidthMin() {
        return widthMin;
    }
    public String getWidthMax() { return widthMax; }
    public String getHeightMin() {
        return heightMin;
    }
    public String getHeightMax() { return heightMax; }
    public String getCapacityMin() {
        return capacityMin;
    }
    public String getCapacityMax() {
        return capacityMax;
    }
    public Boolean isRefrigerated() {
        return isRefrigerated;
    }
}
