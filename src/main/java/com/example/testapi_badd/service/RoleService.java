package com.example.testapi_badd.service;

import com.example.testapi_badd.entity.Role;
import com.example.testapi_badd.repository.RoleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public Role recupRole(String libelle) {
        return roleRepository.findByLibelle(libelle);
    }
}
