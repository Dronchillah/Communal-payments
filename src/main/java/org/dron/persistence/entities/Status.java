package org.dron.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Entity
@ToString

@Table(name = "statuses", schema = "communal payments")
public class Status {

    @Getter
    @Id
    @GeneratedValue
    @Column(name = "s_id", nullable = false)
    private Long id;


    @NonNull
    @Getter
    @Column(name = "status", nullable = false)
    private String status;

}
