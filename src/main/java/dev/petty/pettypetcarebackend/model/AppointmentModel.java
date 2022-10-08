package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "Appointment")
public class AppointmentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id", length = 255, nullable = false)
    private Long booking_id;



    @ManyToOne
    @JoinColumn(name = "pet_id")
    private PetModel pet;


    @ManyToOne
    @JoinColumn(name = "staff_id")
    private StaffModel staff;


    @Column(name = "Type", nullable = false)
    private String type;
    @Column(name = "Date", nullable = false)
    private Date date;
    @Column(name = "Note", nullable = false)
    private String note;
}
