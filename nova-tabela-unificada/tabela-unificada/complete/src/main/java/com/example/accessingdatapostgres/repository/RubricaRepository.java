package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.RubricaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubricaRepository extends JpaRepository<RubricaModel, String> {
}
