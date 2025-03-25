package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.DetalheModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalheRepository extends JpaRepository<DetalheModel, String> {
}
