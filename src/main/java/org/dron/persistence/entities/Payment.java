package org.dron.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import java.util.Date;

@Entity
@Table(name = "payments", schema = "communal payments")
@NoArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "p_id")
    @Getter
    @Setter
    private Long id;

    @Column(name = "template")
    @Getter
    @Setter
    private Long template;

    @Column(name = "card_number")
    @Getter
    @Setter
    private Long cardNumber;

    @Column(name = "sum")
    @Getter
    @Setter
    private Long sum;

    @Column(name = "payment_status")
    @Getter
    @Setter
    private Long statusNumber;

    @Column(name = "creation_datetime")
    @Temporal(value= TemporalType.TIMESTAMP)
    @Getter
    @Setter
    private Date date;
}
