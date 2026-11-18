package com.seduc2.gta.Controllers;


import com.seduc2.gta.Entities.Personagem;
import com.seduc2.gta.Services.PersonagemService;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("api/personagens")
public class PersonagemController {


    private final PersonagemService service;
    public PersonagemController(PersonagemService service){
        this.service = service;
    }



    @GetMapping
    public List<Personagem> mostrarPersonagem(){
        return service.mostrarTodos();
    }



    @PostMapping
    public void criarPersonagem(@RequestBody Personagem p){
        service.criarPersonagem(p);
    }

    @DeleteMapping("/{id}")
    public void deletarPersonagem(@PathVariable int id){
        service.deletarPersonagem(id);
    }

    @PutMapping
    public void alterar(@PathVariable int id
            , @RequestBody Personagem p){
        service.alterar(id,p);
    }


}