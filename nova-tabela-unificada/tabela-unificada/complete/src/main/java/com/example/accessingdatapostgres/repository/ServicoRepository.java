package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.ServicoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<ServicoModel, String> {
}
