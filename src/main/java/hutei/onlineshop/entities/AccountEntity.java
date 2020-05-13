package hutei.onlineshop.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "Account")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Adress billing_address;
    private Boolean isClosed;
    private Date open;
    private Date closed;
   @OneToMany(mappedBy = "account", cascade = CascadeType.REMOVE)
    private Set<Payment> payments = new HashSet<>();
    //@OneToOne(mappedBy = "account", optional = false)
   //private ShoppingCartEntity shoppingCart; //trouble
    @OneToOne
    private Customer customer;
}
