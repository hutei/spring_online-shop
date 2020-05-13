package hutei.onlineshop.entities;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "customers")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    private Adress adress;
    private String phoneNum;
    private String email;
    @OneToOne
    private AccountEntity account;
   // @OneToOne
   // private WebUser webUser;

}
