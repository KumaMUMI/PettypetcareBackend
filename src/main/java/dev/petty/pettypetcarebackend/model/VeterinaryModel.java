package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity(name = "Veterinary")
public class VeterinaryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 255, nullable = false)
    private Long vet_id;

    @OneToOne
    @JoinColumn(name = "staff_id")
    private StaffModel staff;

}
