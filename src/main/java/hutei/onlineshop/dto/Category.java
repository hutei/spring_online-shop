package hutei.onlineshop.dto;

import hutei.onlineshop.entities.CategoryEntity;
import hutei.onlineshop.entities.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Category {
    private int id;
    private String name;
    private Set<ProductEntity> products = new HashSet<>();

    public Category(CategoryEntity categoryEntity){
        this.id = categoryEntity.getId();
        this.name =  categoryEntity.getName();
        this.products = categoryEntity.getProducts();
    }


}
