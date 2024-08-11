package com.example.Autisto.services;

import com.example.Autisto.model.Role;

import java.util.List;

public interface RoleService {
    Role saveRole(Role role);
    Role getRoleById(Long id);
    List<Role> getAllRoles();
    Role getRoleByName(String name);
    void deleteRole(Long id);
}
