package com.seduc2.gta.Services;


import com.seduc2.gta.Entities.Personagem;
import com.seduc2.gta.Repositories.PersonagemRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class PersonagemService {


    private final PersonagemRepository repository;
    public PersonagemService(PersonagemRepository repository) {
        this.repository = repository;
    }


    public void criarPersonagem(Personagem p){
        repository.save(p);
    }


    public List<Personagem> mostrarTodos(){
        return repository.findAll();
    }

    public void deletarPersonagem(int id){
        repository.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Personagem p){
        Personagem personagem = repository.getReferenceById(id);
        personagem.setNome(p.getNome());
        personagem.setApelido(p.getApelido());
        personagem.setCategoriaPersonagem(p.getCategoriaPersonagem());
        personagem.setDescricao(p.getDescricao());
    }
}
