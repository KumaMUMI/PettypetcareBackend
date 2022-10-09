package dev.petty.pettypetcarebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Pet")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PetEntity {

    @Id
    @GeneratedValue
    private Long pet_id;

    @Column(name = "Name", nullable = false)
    private String name;
    @Column(name = "Type", nullable = false)
    private String type;
    @Column(name = "Sex", nullable = false)
    private String sex;
    @Column(name = "Age", nullable = false, length = 100)
    private int age;
    @Column(name = "Breeding", nullable = false)
    private String breeding;
    @Column(name = "Note", nullable = false)
    private String note;

    @ManyToOne(targetEntity = PetOwnerEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id_fk", referencedColumnName = "owner_id", nullable = false)
    private PetOwnerEntity petOwner;

    @OneToOne(targetEntity = AppointEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "appoint_id_fk", referencedColumnName = "appoint_id")
    private AppointEntity appoint;

    @OneToMany(mappedBy = "petTakeCare", targetEntity = TakeCareEntity.class, cascade = CascadeType.ALL)
    private List<TakeCareEntity> takeCare;

    @OneToMany(mappedBy = "petGroom", targetEntity = GroomEntity.class, cascade = CascadeType.ALL)
    private List<GroomEntity> groom;
}
