package dev.petty.pettypetcarebackend.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Barber")
public class BarberEntity {

    @Id
    @GeneratedValue
    @Column(name = "barber_id", nullable = false)
    private Long barber_id;

    @OneToOne(targetEntity = StaffEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id_fk", referencedColumnName = "staff_id")
    private StaffEntity staff;

    @OneToMany(mappedBy = "barber", targetEntity = GroomEntity.class, cascade = CascadeType.ALL)
    private List<GroomEntity> groom;

}