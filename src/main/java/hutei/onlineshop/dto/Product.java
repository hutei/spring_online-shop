package hutei.onlineshop.dto;

import hutei.onlineshop.entities.CategoryEntity;
import hutei.onlineshop.entities.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Product {
    private int id;
    private String name;
    private double price;
    private String imgUrl;
    private String category;

    public Product(ProductEntity productEntity){
        this.id = productEntity.getId();
        this.name = productEntity.getName();
        this.price = productEntity.getPrice();
        this.imgUrl = productEntity.getImgUrl();
        this.category = productEntity.getCategory().getName();
    }
}
