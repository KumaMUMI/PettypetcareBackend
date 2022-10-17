package dev.petty.pettypetcarebackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "appoint_id", nullable = false)
    private Long id;

    @Column(name = "Time", nullable = false)
    private String time;
    @Column(name = "Note", nullable = false)
    private String note;
    @Column(name = "Type", nullable = false)
    private String type;
    @Column(name = "Date", nullable = false)
    private Date date;
    @Column(name = "Booking_REF", nullable = false)
    private Date booking_ref;

    @ManyToOne(targetEntity = PetEntity.class)
    @JoinColumn(name = "pet_id_fk")
    private PetEntity pet;

    @ManyToOne(targetEntity = StaffEntity.class)
    @JoinColumn(name = "staff_id_fk")
    private StaffEntity staff;
}
