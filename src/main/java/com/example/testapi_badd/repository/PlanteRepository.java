package com.example.testapi_badd.repository;

import com.example.testapi_badd.entity.Plante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanteRepository extends JpaRepository<Plante, Long> {
}
