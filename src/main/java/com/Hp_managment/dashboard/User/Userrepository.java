package com.Hp_managment.dashboard.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepository extends JpaRepository<User, Integer> {

    Optional<User> findByContactNumber(String contactNumber);
    Boolean existsByContactNumber(String contactNumber);

}
