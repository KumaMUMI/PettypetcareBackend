package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "CaseReport")
public class CaseReportModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 255, nullable = false)
    private Long case_id;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private PetModel pets;

    @ManyToOne
    @JoinColumn(name = "vet_id")
    private VeterinaryModel veterinary;

}
