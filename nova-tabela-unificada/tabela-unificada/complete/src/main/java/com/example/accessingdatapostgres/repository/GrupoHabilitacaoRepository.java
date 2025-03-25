package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.GrupoHabilitacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoHabilitacaoRepository extends JpaRepository<GrupoHabilitacaoModel, String> {
}
