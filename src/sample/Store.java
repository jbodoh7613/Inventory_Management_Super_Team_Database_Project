package sample;

public class Store {
    int storeId;
    String street, city, state, zip;

    Store(int storeId, String street, String city, String state, String zip) {
        this.storeId = storeId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
}
