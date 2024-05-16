package com.example.diamondstore.repository;

import com.example.diamondstore.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Account, Integer> {
    Account findByUsername(String username);
}