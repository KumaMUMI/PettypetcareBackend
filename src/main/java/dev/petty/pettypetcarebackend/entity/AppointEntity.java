package dev.petty.pettypetcarebackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Appoint")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointEntity {

    @Id
    @GeneratedValue
    @Column(name = "appoint_id", nullable = false)
    private Long appoint_id;

    @Column(name = "Note", nullable = false)
    private String note;
    @Column(name = "Type", nullable = false)
    private String type;
    @Column(name = "Date", nullable = false)
    private Date date;

    @ManyToOne(targetEntity = StaffEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "staff_id_fk", referencedColumnName = "staff_id")
    private StaffEntity staff;

    @ManyToOne(targetEntity = PetEntity.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id_fk", referencedColumnName = "pet_id")
    private PetEntity pet;

}
