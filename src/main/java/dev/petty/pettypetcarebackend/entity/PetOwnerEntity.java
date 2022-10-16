package dev.petty.pettypetcarebackend.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "PetOwner")
@AllArgsConstructor
@NoArgsConstructor
public class PetOwnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long owner_id;

    @Column(name = "Fname", nullable = false)
    private String fname;
    @Column(name = "Lname", nullable = false)
    private String lname;
    @Column(name = "Gender", nullable = false)
    private String gender;
    @Column(name = "DateOfBirth", nullable = false)
    private Date dob;
    @Column(name = "tel", nullable = false, length = 10)
    private String tel;
    @Column(name = "Email", nullable = false)
    private String email;

    @OneToMany
    @JoinColumn(name = "owner_id_fk")
    private List<PetEntity> pets;

}
