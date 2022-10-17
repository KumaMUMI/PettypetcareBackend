package dev.petty.pettypetcarebackend.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Staff")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StaffEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Staff_id",nullable = false)
    private Long id;

    @Column(name = "Fname", nullable = false)
    private String fname;
    @Column(name = "Lname", nullable = false)
    private String lname;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "DateOfBirth", nullable = false)
    private Date dob;
    @Column(name = "Salary", nullable = false)
    private double salary;
    @Column(name = "Tel", nullable = false, length = 10)
    private String tel;
    @Column(name = "Email", nullable = false)
    private String email;

    @OneToMany
    @JoinColumn(name = "staff_id_fk")
    private List<BarberEntity> barber;

    @OneToMany
    @JoinColumn(name = "staff_id_fk")
    private List<VeterinaryEntity> veterinary;

}
