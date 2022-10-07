package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "GroommingReport")
public class GroommingReportModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 255, nullable = false)
    private Long groom_id;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private PetModel pets;

    @ManyToOne
    @JoinColumn(name = "barber_id")
    private BarberModel barber;

    @Column(name = "Date", nullable = false)
    private Date date;

}
