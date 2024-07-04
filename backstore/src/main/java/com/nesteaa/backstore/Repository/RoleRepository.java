package com.nesteaa.backstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nesteaa.backstore.Model.Role;
import java.util.Optional;


public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(String name);

}
