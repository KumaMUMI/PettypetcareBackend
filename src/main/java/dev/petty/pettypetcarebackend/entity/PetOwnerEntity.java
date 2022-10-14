package dev.petty.pettypetcarebackend.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "PetOwner")
@AllArgsConstructor
@NoArgsConstructor
public class PetOwnerEntity {

    @Id
    @GeneratedValue
    private Long owner_id;

    @Column(name = "Fname", nullable = false)
    private String Fname;
    @Column(name = "Lname", nullable = false)
    private String Lname;
    @Column(name = "Sex", nullable = false)
    private String sex;
    @Column(name = "DateOfBirth", nullable = false)
    private Date dob;
    @Column(name = "tel", nullable = false, length = 10)
    private String tel;
    @Column(name = "Email", nullable = false)
    private String email;

    @OneToMany(mappedBy = "petOwner", targetEntity = PetEntity.class, cascade = CascadeType.ALL)
    private List<PetEntity> pets;

}
