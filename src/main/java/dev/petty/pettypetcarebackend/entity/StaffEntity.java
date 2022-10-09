package dev.petty.pettypetcarebackend.entity;

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
    @GeneratedValue
    private Long staff_id;

    @Column(name = "Fname", nullable = false)
    private String fname;
    @Column(name = "Lname", nullable = false)
    private String lname;
    @Column(name = "Sex", nullable = false)
    private String sex;
    @Column(name = "DateOfBirth", nullable = false)
    private Date dob;
    @Column(name = "Salary", nullable = false)
    private double salary;
    @Column(name = "Tel", nullable = false, length = 10)
    private String tel;
    @Column(name = "Email", nullable = false)
    private String email;

    @OneToOne(targetEntity = BarberEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "barber_id_fk", referencedColumnName = "barber_id")
    private BarberEntity barber;

    @OneToOne(targetEntity = VeterinaryEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "veterinary_id_fk", referencedColumnName = "veterinary_id")
    private VeterinaryEntity veterinary;

    @OneToMany(mappedBy = "staff", targetEntity = AppointEntity.class, cascade = CascadeType.ALL)
    private List<AppointEntity> appoints;

}
