package com.seduc2.gta.Controllers;


import com.seduc2.gta.Entities.Missao;
import com.seduc2.gta.services.MissaoService;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/missoes")
public class MissaoController {


    private final MissaoService service;
    public MissaoController(MissaoService service){
        this.service = service;
    }



    @GetMapping
    public List<Missao> mostrarMissao(){
        return service.mostrarTodos();
    }



    @PostMapping
    public void criarMissao(@RequestBody Missao m){
        service.criarMissao(m);
    }


    @DeleteMapping("/{id}")
    public void deletarMissao(@PathVariable int id){
        service.deletarMissao(id);
    }


    @PutMapping("/{id}")
    public void alterarMissao(@PathVariable int id, @RequestBody Missao m){
        service.alterarMissao(id,m);
    }
}
