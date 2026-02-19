package supermarket;

public class ProductDTO {
    private int productId;
    private String productName;
    private String category;
    private double price;
    private int stock;

    public ProductDTO() {}

    public ProductDTO(String productName, String category, double price, int stock) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public ProductDTO(int productId, String productName, String category, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Getters & Setters
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
