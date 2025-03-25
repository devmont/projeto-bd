package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.ProcedimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedimentoRepository extends JpaRepository<ProcedimentoModel, String> {
}
