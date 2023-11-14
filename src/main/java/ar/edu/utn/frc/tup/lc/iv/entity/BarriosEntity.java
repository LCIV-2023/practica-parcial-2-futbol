package ar.edu.utn.frc.tup.lc.iv.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "barrios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BarriosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;
}
