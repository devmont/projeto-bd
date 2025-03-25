package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.RegistroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<RegistroModel, String> {
}
