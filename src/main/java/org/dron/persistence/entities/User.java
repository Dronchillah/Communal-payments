package org.dron.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Entity
@Table(name = "users", schema = "communal payments")
@NoArgsConstructor
@Setter
public class User {

    @Id
    @GeneratedValue
    @Column(name = "u_id")
    @Getter
    private Long id;

    @Column(name = "full_name")
    @Getter
    @Setter
    private String name;

    @Column(name = "email")
    @Getter
    @Setter
    private String email;

    @Column(name = "phone_number")
    @Getter
    @Setter
    private int phoneNumber;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @Getter
    @Setter
    private List<PaymentAddress> addresses = new ArrayList<>();
}
