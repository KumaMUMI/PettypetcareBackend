package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity(name = "Staff")
public class StaffModel {
    @Id
    @Column(length = 255, nullable = false)
    private Long staff_id;

    @OneToMany(mappedBy = "booking_id")
    private Set<AppointmentModel> appointment;


    @OneToOne(mappedBy = "vet_id")
    @PrimaryKeyJoinColumn
    private VeterinaryModel veterinary;

    @OneToOne(mappedBy = "barber_id")
    @PrimaryKeyJoinColumn
    private BarberModel barber;

    @Column(name = "FName", nullable = false)
    private String fname;
    @Column(name = "LName", nullable = false)
    private String lname;
    @Column(name = "sex", nullable = false, length = 50)
    private String sex;
    @Column(name = "Bdate", nullable = false, length = 10)
    private String bdate;
    @Column(name = "Email", nullable = false)
    private String email;
    @Column(name = "Tel", nullable = false)
    private String tel;
    @Column(name = "Salary", nullable = false)
    private String salary;

}
