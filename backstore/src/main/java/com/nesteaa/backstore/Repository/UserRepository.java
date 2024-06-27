package com.nesteaa.backstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nesteaa.backstore.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
