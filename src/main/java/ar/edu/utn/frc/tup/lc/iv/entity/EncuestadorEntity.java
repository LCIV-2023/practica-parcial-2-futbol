package ar.edu.utn.frc.tup.lc.iv.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "encuestadores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EncuestadorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;
}
