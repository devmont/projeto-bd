package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.DescricaoDetalheModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescricaoDetalheRepository extends JpaRepository<DescricaoDetalheModel, String> {
}
