package dev.petty.pettypetcarebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "History")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_id", nullable = false)
    private Long id;

    @Column(name = "Subtype", nullable = false)
    private String subtype;

    @Column(name = "Price", nullable = false)
    private double price;

    @OneToOne(targetEntity = AppointEntity.class)
    @JoinColumn(name = "appoint_id")
    private AppointEntity appoint;

}
