package hutei.onlineshop.entities;

import lombok.*;


import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date paid;
    private Double total;
    private String details;
    @ManyToOne
    private OrderEntity order;
    @ManyToOne
  private AccountEntity account;
}
