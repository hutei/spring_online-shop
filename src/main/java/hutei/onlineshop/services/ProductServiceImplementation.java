package hutei.onlineshop.services;

import hutei.onlineshop.dto.Category;
import hutei.onlineshop.dto.Product;
import hutei.onlineshop.entities.CategoryEntity;
import hutei.onlineshop.entities.ProductEntity;
import hutei.onlineshop.repository.CategoryJPARepository;
import hutei.onlineshop.repository.ProductJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImplementation implements  ProductService{
    @Autowired
    private ProductJPARepository productRepository;
    @Autowired
    private CategoryJPARepository categoryRepository;



    @Override
    public ProductEntity addProduct(Product product) {
        CategoryEntity category=  categoryRepository.findByName(product.getCategory());

        if(category == null){
          category =  categoryRepository.save(new CategoryEntity(product.getCategory()));
        }

        ProductEntity productEntity = new ProductEntity(product);
        productEntity.setCategory(category);

        return   productRepository.save(productEntity);
    }

    @Override
    public ProductEntity getProduct(int id) {
        return productRepository.getOne(id);
    }

    @Override
    public List<ProductEntity> getProductsByCategory(String name) {
        return null;
    }
}
