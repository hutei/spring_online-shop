package hutei.onlineshop.services;

import hutei.onlineshop.dto.Product;
import hutei.onlineshop.entities.ProductEntity;

import java.util.List;

public interface ProductService {
    public ProductEntity addProduct(Product product);
    public ProductEntity getProduct(int id);
    public List<ProductEntity> getProductsByCategory(String name);
}
