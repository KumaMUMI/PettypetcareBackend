package dev.petty.pettypetcarebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    @JsonBackReference
    private StaffEntity staff;

    @OneToMany(mappedBy = "veterinary",targetEntity = AppointEntity.class, cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<AppointEntity> appoint;

}
