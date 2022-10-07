package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity(name = "Veterinary")
public class VeterinaryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 255, nullable = false)
    private Long vet_id;

    @OneToOne(mappedBy = "veterinary")
    @PrimaryKeyJoinColumn
    private StaffModel staff;

    @OneToMany(mappedBy = "case_id")
    private Set<CaseReportModel> caseReport;

}
