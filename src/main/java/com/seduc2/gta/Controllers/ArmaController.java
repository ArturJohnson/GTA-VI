package com.seduc2.gta.Controllers;

import com.seduc2.gta.Entities.Arma;
import com.seduc2.gta.Services.ArmaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/armas")
@CrossOrigin("*")
public class ArmaController {

    private final ArmaService service;

    public ArmaController(ArmaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Arma> mostrarArma() {
        return service.mostrarTodos();
    }

    @PostMapping
    public void criarArma(@RequestBody Arma a) {
        service.criarArma(a);
    }

    @DeleteMapping("/{id}")
    public void deletarArma(@PathVariable int id) {
        service.deletarArma(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody Arma a) {
        service.alterar(id, a);
    }
}