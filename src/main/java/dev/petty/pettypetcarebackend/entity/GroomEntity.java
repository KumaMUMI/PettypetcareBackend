package dev.petty.pettypetcarebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Groom")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroomEntity {
    @Id
    @GeneratedValue
    @Column(name = "groom_id", nullable = false)
    private Long groom_id;

    @Column(name = "Date", nullable = false)
    private Date date;

    @ManyToOne(targetEntity = PetEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id_kf", referencedColumnName = "pet_id")
    private PetEntity petGroom;

    @ManyToOne(targetEntity = BarberEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "barber_id_fk", referencedColumnName = "barber_id")
    private BarberEntity barber;

}
