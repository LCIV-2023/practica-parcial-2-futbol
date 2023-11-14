package ar.edu.utn.frc.tup.lc.iv.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "resultados")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultadosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long encuestadorId;

    @Column
    private Long barrioId;

    @Column
    private Long equipoId;

    @Column
    private Integer votos;

}
