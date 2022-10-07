package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity(name = "PetOwner")
public class PetOwnerModels {

    @Id
    @Column(nullable = false)
    private Long owner_id;

    @OneToMany(mappedBy = "pet_id")
    private Set<PetModel> pets;

    @Column(name = "FName", nullable = false)
    private String fname;
    @Column(name = "LName", nullable = false)
    private String lname;
    @Column(name = "sex", nullable = false, length = 50)
    private String sex;
    @Column(name = "Tel", nullable = false, length = 10)
    private String tel;
    @Column(name = "Email", nullable = false)
    private String email;
}
