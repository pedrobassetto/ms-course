package com.pedrobassetto.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedrobassetto.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
