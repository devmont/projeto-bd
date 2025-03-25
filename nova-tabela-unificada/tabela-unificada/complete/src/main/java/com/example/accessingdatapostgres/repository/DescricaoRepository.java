package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.DescricaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescricaoRepository extends JpaRepository<DescricaoModel, String> {
}
