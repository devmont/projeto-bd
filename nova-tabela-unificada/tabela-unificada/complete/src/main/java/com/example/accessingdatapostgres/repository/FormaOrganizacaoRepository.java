package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.FormaOrganizacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaOrganizacaoRepository extends JpaRepository<FormaOrganizacaoModel, String> {
}
