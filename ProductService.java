package supermarket;

import java.util.List;

public class ProductService {
    ProductDAO dao = new ProductDAOImpl();

    public void addProduct(String name, String category, double price, int stock) {
        dao.addProduct(new ProductDTO(name, category, price, stock));
    }

    public void viewProducts() {
        List<ProductDTO> list = dao.getAllProducts();
        for (ProductDTO p : list) {
            System.out.println(p.getProductId() + " | " + p.getProductName() + " | " +
                    p.getCategory() + " | ₹" + p.getPrice() + " | Stock: " + p.getStock());
        }
    }

    public void updateStock(int id, int stock) {
        dao.updateStock(id, stock);
    }

    public void deleteProduct(int id) {
        dao.deleteProduct(id);
    }

    public void searchProduct(int id) {
        ProductDTO p = dao.getProductById(id);
        if (p != null)
            System.out.println(p.getProductId() + " | " + p.getProductName() + " | " + p.getCategory() + " | ₹" + p.getPrice() + " | Stock: " + p.getStock());
        else
            System.out.println("❌ Product not found!");
    }
}
