package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.HabilitacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilitacaoRepository extends JpaRepository<HabilitacaoModel, String> {
}
