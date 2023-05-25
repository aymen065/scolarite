package com.FST.scolarite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FST.scolarite.entities.Administrator;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
}
