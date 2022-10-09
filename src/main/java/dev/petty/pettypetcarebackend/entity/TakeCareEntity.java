package dev.petty.pettypetcarebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Takecare")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TakeCareEntity {

    @Id
    @GeneratedValue
    @Column(name = "care_id", nullable = false)
    private Long care_id;

    @Column(name = "treatment_history", nullable = false)
    private String treatmentHistory;
    @Column(name = "Date", nullable = false)
    private Date date;

    @ManyToOne(targetEntity = PetEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id_fk", referencedColumnName = "pet_id")
    private PetEntity petTakeCare;

    @ManyToOne(targetEntity = VeterinaryEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "veterinary_id_fk", referencedColumnName = "veterinary_id")
    private VeterinaryEntity veterinary;

}
