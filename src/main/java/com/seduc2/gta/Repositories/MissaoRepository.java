package com.seduc2.gta.Repositories;

import com.seduc2.gta.Entities.Missao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissaoRepository extends JpaRepository<Missao, Integer> {
}
