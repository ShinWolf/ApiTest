package com.example.testapi_badd.repository;

import com.example.testapi_badd.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByLibelle(String libelle);
}
