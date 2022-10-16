package dev.petty.pettypetcarebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Pet")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pet_id;

    @Column(name = "Name", nullable = false)
    private String name;
    @Column(name = "Type", nullable = false)
    private String type;
    @Column(name = "Sex", nullable = false)
    private String sex;
    @Column(name = "Age", nullable = false, length = 100)
    private String age;
    @Column(name = "Breeding", nullable = false)
    private String breeding;
    @Column(name = "Weight", nullable = false)
    private String weight;

}
