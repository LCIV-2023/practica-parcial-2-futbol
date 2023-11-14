package ar.edu.utn.frc.tup.lc.iv.controllers;

import ar.edu.utn.frc.tup.lc.iv.entity.BarriosEntity;
import ar.edu.utn.frc.tup.lc.iv.entity.EncuestadorEntity;
import ar.edu.utn.frc.tup.lc.iv.entity.EquipoEntity;
import ar.edu.utn.frc.tup.lc.iv.entity.ResultadosEntity;
import ar.edu.utn.frc.tup.lc.iv.repository.BarrioRepository;
import ar.edu.utn.frc.tup.lc.iv.repository.EncuestadorRepository;
import ar.edu.utn.frc.tup.lc.iv.repository.EquipoRepository;
import ar.edu.utn.frc.tup.lc.iv.repository.ResultadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/")
public class ApisController {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private BarrioRepository barrioRepository;

    @Autowired
    private EncuestadorRepository encuestadorRepository;

    @Autowired
    private ResultadoRepository resultadosJpaRepository;

    @GetMapping("equipos")
    public ResponseEntity<List<EquipoEntity>> getEquipos() {
        return ResponseEntity.ok(equipoRepository.findAll());
    }

    @GetMapping("barrios")
    public ResponseEntity<List<BarriosEntity>> getBarrios() {
        return ResponseEntity.ok(barrioRepository.findAll());
    }

    @GetMapping("encuestadores")
    public ResponseEntity<List<EncuestadorEntity>> getEncuestador() {
        return ResponseEntity.ok(encuestadorRepository.findAll());
    }

    @GetMapping("resultados")
    public ResponseEntity<List<ResultadosEntity>> getResultados() {
        return ResponseEntity.ok(resultadosJpaRepository.findAll());
    }
}
