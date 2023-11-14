package ar.edu.utn.frc.tup.lc.iv.repository;

import ar.edu.utn.frc.tup.lc.iv.entity.BarriosEntity;
import ar.edu.utn.frc.tup.lc.iv.entity.ResultadosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultadoRepository extends JpaRepository<ResultadosEntity, Long> {
}
