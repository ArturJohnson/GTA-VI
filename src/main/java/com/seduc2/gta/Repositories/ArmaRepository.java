package com.seduc2.gta.Repositories;

import com.seduc2.gta.Entities.Arma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmaRepository extends JpaRepository<Arma, Integer> {
}