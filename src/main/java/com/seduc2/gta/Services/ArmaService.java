package com.seduc2.gta.Services;

import com.seduc2.gta.Entities.Arma;
import com.seduc2.gta.Repositories.ArmaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmaService {

    private final ArmaRepository repository;

    public ArmaService(ArmaRepository repository) {
        this.repository = repository;
    }

    public void criarArma(Arma a) {
        repository.save(a);
    }

    public List<Arma> mostrarTodos() {
        return repository.findAll();
    }

    public void deletarArma(int id) {
        repository.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Arma a) {
        Arma arma = repository.getReferenceById(id);
        arma.setNome(a.getNome());
        arma.setCategoria(a.getCategoria());
        arma.setFabricante(a.getFabricante());
        arma.setImagem(a.getImagem());
        arma.setDescricao(a.getDescricao());
    }
}