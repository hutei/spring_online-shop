package hutei.onlineshop.entities;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"number"})
@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int number;
    private Date ordered;
    private Date shipped;
    @OneToOne
    private Adress ship_to;
    private OrderStatus status;
    @OneToMany
    private List<LineItemEntity> lineItem = new LinkedList<>();
//   @OneToMany(mappedBy = "order", cascade = CascadeType.REMOVE)
//    private Set<Payment> payments = new HashSet<>();
//    @OneToOne
//    private AccountEntity account;


}
