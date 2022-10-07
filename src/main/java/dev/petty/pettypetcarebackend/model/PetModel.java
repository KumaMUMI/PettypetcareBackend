package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity(name = "Pet")
public class PetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pet_id;

//    @OneToOne(mappedBy = "booking_id")
//    @PrimaryKeyJoinColumn
//    private AppointmentModel appointment;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private PetOwnerModels pet_owner;

    @OneToMany(mappedBy = "groom_id")
    private Set<GroommingReportModel> groommingRepor;

    @OneToMany(mappedBy = "case_id")
    private Set<CaseReportModel> caseReport;

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

}
