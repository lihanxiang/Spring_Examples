package form;

public class ProductForm {
    private String name;
    private String price;
    private String inventory;
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public String getInventory() {
        return inventory;
    }
}
