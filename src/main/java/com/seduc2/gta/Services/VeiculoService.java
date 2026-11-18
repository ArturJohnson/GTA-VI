package com.seduc2.gta.Services;

import com.seduc2.gta.Entities.Veiculo;
import com.seduc2.gta.Repositories.VeiculoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    private final VeiculoRepository repository;

    public VeiculoService(VeiculoRepository repository) {
        this.repository = repository;
    }

    public void criarVeiculo(Veiculo v) {
        repository.save(v);
    }

    public List<Veiculo> mostrarTodos() {
        return repository.findAll();
    }

    public void deletarVeiculo(int id) {
        repository.deleteById(id);
    }

    @Transactional
    public void alterar(int id, Veiculo v) {
        Veiculo veiculo = repository.getReferenceById(id);
        veiculo.setNome(v.getNome());
        veiculo.setMarca(v.getMarca());
        veiculo.setCategoria(v.getCategoria());
        veiculo.setImagem(v.getImagem());
        veiculo.setDescricao(v.getDescricao());
    }
}