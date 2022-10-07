package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity(name = "Barber")
public class BarberModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 255, nullable = false)
    private Long barber_id;

    @OneToOne
    @JoinColumn(name = "staff_id")
    private StaffModel staff;

    @OneToMany(mappedBy = "groom_id")
    private Set<GroommingReportModel> groommingRepor;



}


