package api;

import entity.Product;

import java.util.List;

public interface ProductDao {
    void saveProduct(Product product);
    void saveProducts(List<Product> products);
    void removeProductById(long id);
    void removeProductByName(String productName);
    Product getProductById(long id);
    Product getProductByName(String productName);
    List<Product> getAllProducts();


}
