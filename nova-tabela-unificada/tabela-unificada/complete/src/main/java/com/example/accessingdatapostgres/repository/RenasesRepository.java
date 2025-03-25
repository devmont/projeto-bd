package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.RenasesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenasesRepository extends JpaRepository<RenasesModel, String> {
}
