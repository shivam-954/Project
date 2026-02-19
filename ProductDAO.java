package supermarket;

import java.util.List;

public interface ProductDAO {
    void addProduct(ProductDTO product);
    List<ProductDTO> getAllProducts();
    void updateStock(int id, int stock);
    void deleteProduct(int id);
    ProductDTO getProductById(int id);
}
