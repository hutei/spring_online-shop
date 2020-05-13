package hutei.onlineshop.entities;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "lineItem")
public class LineItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Integer quantity;
    private double price;
    @ManyToOne
    private ProductEntity productEntity;
    @ManyToOne
    private ShoppingCartEntity shoppingCart;
    @ManyToOne
    private OrderEntity order;


}
