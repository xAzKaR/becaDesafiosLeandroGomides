//package io.github.leandrogomides.nttMED.controllers;
//
//import io.github.leandrogomides.nttMED.model.entities.Consultorio;
////import io.github.leandrogomides.nttMED.model.repositories.ConsultorioRepository;
//import io.github.leandrogomides.nttMED.model.services.ConsultorioService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/consultorio")
//public class ConsultorioController {
//
////    @Autowired
////    private ConsultorioRepository consultorioRepository;
//
//    @Autowired
//    private ConsultorioService consultorioService;
//
//    @PostMapping
//    public ResponseEntity<Consultorio> criar(@RequestBody Consultorio consultorio) {
//        Consultorio criarConsultorio = consultorioService.criar(consultorio);
//
//        return ResponseEntity.created(null).body(criarConsultorio);
//
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity deletar(@PathVariable Long id) {
//        consultorioService.deletar(id);
//
//        return ResponseEntity.noContent().build();
//    }
//
//    @PatchMapping("/{id}")
//    public ResponseEntity<Consultorio> atualizar(@RequestBody Consultorio consultorio, @PathVariable Long id) {
//        Consultorio atualizarConsultorio = consultorioService.atualizar(consultorio, id);
//
//        return ResponseEntity.ok(atualizarConsultorio);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Consultorio> obter(@PathVariable Long id) {
//        Consultorio obterConsultorio = consultorioService.obter(id);
//
//        return ResponseEntity.ok(obterConsultorio);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Consultorio>> listar() {
//        List<Consultorio> listarConsultorio = consultorioService.listar();
//
//        return ResponseEntity.ok(listarConsultorio);
//    }
//}
