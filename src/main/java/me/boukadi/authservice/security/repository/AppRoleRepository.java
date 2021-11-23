package me.boukadi.authservice.security.repository;

import me.boukadi.authservice.security.entity.AppRole;
import me.boukadi.authservice.security.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByRoleName(String roleName);
}
