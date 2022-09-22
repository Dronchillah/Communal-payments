package org.dron.persistence.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payment_adress", schema = "communal payments")
@NoArgsConstructor
public class PaymentAddress {

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "pa_id")
    private Long id;

    @Column(name = "address")
    @Getter
    @Setter
    private String address;

    @Column(name = "user_id", insertable = false, updatable = false)
    @Getter
    @Setter
    private int user_id;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @Getter
    @Setter
    private User user;
}
