package domain;

public class Product {
    private long id;
    private String name;
    private String price;
    private String inventory;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() { return name; }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getPrice() { return price; }
    public void setInventory(String inventory) {
        this.inventory = inventory;
    }
    public String getInventory() { return inventory; }
}




