package dev.petty.pettypetcarebackend.model;

import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Pet's Owner")
public class Pet_Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 13,nullable = false)
    private String Owner_ID;

    @Column(length = 255,nullable = false)
    private String Fname;
    @Column(length = 255,nullable = false)
    private String Lname;
    @Column(length = 10,nullable = false)
    private String Sex;
    @Column(nullable = false)
    private Date Bdata;
    @Column(length = 255,nullable = false)
    private String Email;
    @Column(length = 10,nullable = false)
    private String Tel;


}
