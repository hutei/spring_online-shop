package hutei.onlineshop.entities;

import hutei.onlineshop.dto.Product;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id","price"})
@Entity
@Table(name = "product")
public class ProductEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private String imgUrl;
    @ManyToOne
    private CategoryEntity category;

    public ProductEntity(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.imgUrl = product.getImgUrl();
    }

}
