package com.seduc2.gta.services;


import com.seduc2.gta.Entities.Missao;
import com.seduc2.gta.Repositories.MissaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class MissaoService {


    private final MissaoRepository repository;
    public MissaoService(MissaoRepository repository) {
        this.repository = repository;
    }


    public void criarMissao(Missao m){
        repository.save(m);
    }


    public List<Missao> mostrarTodos(){
        return repository.findAll();
    }


    public void deletarMissao(int id){
        repository.deleteById(id);
    }



    @Transactional
    public void alterarMissao(int id, Missao m){
        Missao missao = repository.getReferenceById(id);
        missao.setNome(m.getNome());
        missao.setLocal(m.getLocal());
        missao.setDificuldade(m.getDificuldade());
        missao.setDescricao(m.getDescricao());
    }


}
