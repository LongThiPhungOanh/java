package BaiTapGVGiao;

public class Product {
    Object[] arr = new Object[5];
    protected int id = 0;
    protected String name;
    protected double price;
    protected double quantity;
    protected String description;
    protected final String ID = "MaId 00";
    public int getId() {
        return id++;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String MaId() {
        getId();
        String total = ID + id;
        return total ;
    }
    public Product() {}
    public Product(int id, String name, double price, double quantity, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
}
