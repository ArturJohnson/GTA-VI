package com.seduc2.gta.Repositories;


import com.seduc2.gta.Entities.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {
}
