package com.orzelke.nbagame.repository;

import com.orzelke.nbagame.model.Role;
import com.orzelke.nbagame.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleUser);
}
