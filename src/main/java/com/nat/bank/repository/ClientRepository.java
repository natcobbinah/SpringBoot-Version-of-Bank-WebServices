package com.nat.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nat.bank.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
