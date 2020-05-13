package hutei.onlineshop.entities;

        import hutei.onlineshop.dto.Category;
        import lombok.*;

        import javax.persistence.*;
        import java.util.HashSet;
        import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"name"})
@Entity
@Table(name = "category")

public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private Set<ProductEntity> products = new HashSet<>();

    public CategoryEntity(String name){
        this.name = name;
    }

    public CategoryEntity(Category category) {
        this.id = category.getId();
        this.name =  category.getName();
        this.products = category.getProducts();
    }
}
