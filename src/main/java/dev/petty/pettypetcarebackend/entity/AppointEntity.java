package dev.petty.pettypetcarebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Appoint")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointEntity {

    @Id
    @GeneratedValue
    @Column(name = "appoint_id", nullable = false)
    private Long appoint_id;

    @Column(name = "Note", nullable = false)
    private String note;
    @Column(name = "Type", nullable = false)
    private String type;
    @Column(name = "Date", nullable = false)
    private Date date;


    @ManyToOne(targetEntity = PetEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id_fk", referencedColumnName = "pet_id")
    @JsonBackReference
    private PetEntity pet;

    @ManyToOne(targetEntity = BarberEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "barber_id_fk", referencedColumnName = "barber_id")
    @JsonBackReference
    private BarberEntity barber;

    @ManyToOne(targetEntity = VeterinaryEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "veterinary_id_fk", referencedColumnName = "veterinary_id")
    @JsonBackReference
    private VeterinaryEntity veterinary;

}
