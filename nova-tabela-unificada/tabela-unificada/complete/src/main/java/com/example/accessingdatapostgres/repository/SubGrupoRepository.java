package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.SubGrupoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubGrupoRepository extends JpaRepository<SubGrupoModel, String> {
}
