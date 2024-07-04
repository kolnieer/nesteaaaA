package com.nesteaa.backstore.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nesteaa.backstore.Model.UserAuth;

public interface UserAuthRepository extends JpaRepository<UserAuth, Long> {
    Optional<UserAuth> findByEmail(String email);
    Optional<UserAuth> findByUsername(String username);
    Optional<UserAuth> findByUsernameOrEmail(String email, String username);

    boolean existsByEmail(String email);
    boolean existsByUsername(String username);


}
