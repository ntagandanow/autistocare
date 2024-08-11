package com.example.Autisto.controller;

import com.example.Autisto.model.Role;
import com.example.Autisto.model.User;
import com.example.Autisto.services.RoleService;
import com.example.Autisto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final UserService userService;
    private final RoleService roleService;

    @Autowired
    public AdminController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @GetMapping("/dashboard")
    public String adminDashboard(Model model) {
        model.addAttribute("users", userService.findAllUsers());
        model.addAttribute("roles", roleService.findAllRoles());
        return "admin/dashboard";
    }

    @GetMapping("/users")
    public String manageUsers(Model model) {
        List<User> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "admin/manage-users";
    }

    @GetMapping("/user/edit/{id}")
    public String editUser(@PathVariable Long id, Model model) {
        User user = userService.findUserById(id);
        if (user != null) {
            model.addAttribute("user", user);
            model.addAttribute("roles", roleService.findAllRoles());
            return "admin/edit-user";
        } else {
            // Handle user not found
            return "redirect:/admin/users";
        }
    }

    @PostMapping("/user/save")
    public String saveUser(@ModelAttribute User user, @RequestParam String roleName) {
        Role role = roleService.findByName(roleName);
        if (role != null) {
            user.setRole(role);
            userService.saveUser(user);
        } else {
            // Handle role not found case
            return "redirect:/admin/users";
        }
        return "redirect:/admin/users";
    }

    @GetMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "redirect:/admin/users";
    }

    @GetMapping("/roles")
    public String manageRoles(Model model) {
        List<Role> roles = roleService.findAllRoles();
        model.addAttribute("roles", roles);
        return "admin/manage-roles";
    }

    @GetMapping("/role/edit/{id}")
    public String editRole(@PathVariable Long id, Model model) {
        Role role = roleService.findRoleById(id);
        if (role != null) {
            model.addAttribute("role", role);
            return "admin/edit-role";
        } else {
            // Handle role not found
            return "redirect:/admin/roles";
        }
    }

    @PostMapping("/role/save")
    public String saveRole(@ModelAttribute Role role) {
        roleService.saveRole(role);
        return "redirect:/admin/roles";
    }

    @GetMapping("/role/delete/{id}")
    public String deleteRole(@PathVariable Long id) {
        roleService.deleteRoleById(id);
        return "redirect:/admin/roles";
    }
}
