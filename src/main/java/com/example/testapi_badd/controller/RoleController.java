package com.example.testapi_badd.controller;

import com.example.testapi_badd.entity.Role;
import com.example.testapi_badd.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/role")
public class RoleController {

    private RoleService roleService;

    @PostMapping(path = "/getRole")
    public Role getRoleByLibelle(@RequestBody String libelle) {
        return this.roleService.recupRole(libelle);
    }
}
