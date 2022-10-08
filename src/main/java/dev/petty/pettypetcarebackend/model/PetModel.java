package dev.petty.pettypetcarebackend.model;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity(name = "Pet")
public class PetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long pet_id;

    @OneToMany
    @JoinColumn(name = "booking_id")
    private Set<AppointmentModel> appointment;


    @ManyToOne
    @JoinColumn(name = "owner_id")
    private PetOwnerModels owner;

    @OneToMany(mappedBy = "groom_id")
    private Set<GroommingReportModel> groommingRepor;

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
    @Column(name = "Note")
    private String note;

}
