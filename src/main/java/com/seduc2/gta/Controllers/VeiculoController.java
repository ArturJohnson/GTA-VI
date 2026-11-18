package com.seduc2.gta.Controllers;

import com.seduc2.gta.Entities.Veiculo;
import com.seduc2.gta.Services.VeiculoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/veiculos")
@CrossOrigin("*")
public class VeiculoController {

    private final VeiculoService service;

    public VeiculoController(VeiculoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Veiculo> mostrarVeiculo() {
        return service.mostrarTodos();
    }

    @PostMapping
    public void criarVeiculo(@RequestBody Veiculo v) {
        service.criarVeiculo(v);
    }

    @DeleteMapping("/{id}")
    public void deletarVeiculo(@PathVariable int id) {
        service.deletarVeiculo(id);
    }

    @PutMapping("/{id}")
    public void alterar(@PathVariable int id, @RequestBody Veiculo v) {
        service.alterar(id, v);
    }
}