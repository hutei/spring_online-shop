package hutei.onlineshop.entities;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "shoppingcarts")
public class ShoppingCartEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date created;
    @OneToMany
    private List<LineItemEntity> lineItems = new LinkedList<>();
    //@OneToOne
    //private AccountEntity account;
   // @OneToOne
   // private WebUser webUser;


}
