package dev.petty.pettypetcarebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonBackReference
    private PetOwnerEntity petOwner;

    @OneToMany(mappedBy = "pet",targetEntity = AppointEntity.class, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<AppointEntity> appoint;

}
