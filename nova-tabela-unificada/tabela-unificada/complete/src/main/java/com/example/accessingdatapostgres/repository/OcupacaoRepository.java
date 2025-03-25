package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.OcupacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcupacaoRepository extends JpaRepository<OcupacaoModel, String> {
}
