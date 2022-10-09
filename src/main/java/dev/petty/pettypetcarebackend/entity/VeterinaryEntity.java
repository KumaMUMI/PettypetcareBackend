package dev.petty.pettypetcarebackend.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Veterinary")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VeterinaryEntity {

    @Id
    @GeneratedValue
    @Column(name = "veterinary_id", nullable = false)
    private Long veterinary_id;

    @OneToOne(targetEntity = StaffEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id_fk", referencedColumnName = "staff_id")
    private StaffEntity staff;

    @OneToMany(mappedBy = "veterinary", targetEntity = TakeCareEntity.class, cascade = CascadeType.ALL)
    private List<TakeCareEntity> takeCares;

}