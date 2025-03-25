package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.GrupoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<GrupoModel, String> {
}
