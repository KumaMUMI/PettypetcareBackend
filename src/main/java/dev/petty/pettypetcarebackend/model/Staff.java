package dev.petty.pettypetcarebackend.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "Staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

}
