package me.boukadi.authservice.security.service;

import me.boukadi.authservice.security.entity.AppRole;
import me.boukadi.authservice.security.entity.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}
