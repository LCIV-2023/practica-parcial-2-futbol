package ar.edu.utn.frc.tup.lc.iv.repository;

import ar.edu.utn.frc.tup.lc.iv.entity.BarriosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarrioRepository extends JpaRepository<BarriosEntity, Long> {
}
