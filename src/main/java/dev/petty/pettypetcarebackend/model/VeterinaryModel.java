package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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

    @OneToMany(mappedBy = "case_id")
    private Set<CaseReportModel> caseReport;

}
