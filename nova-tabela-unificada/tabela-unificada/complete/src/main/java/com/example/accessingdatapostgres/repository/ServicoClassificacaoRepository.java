package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.ServicoClassificacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoClassificacaoRepository extends JpaRepository<ServicoClassificacaoModel, String> {
}
