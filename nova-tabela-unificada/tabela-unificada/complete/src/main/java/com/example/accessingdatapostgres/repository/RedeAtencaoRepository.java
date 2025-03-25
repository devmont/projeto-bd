package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.RedeAtencaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedeAtencaoRepository extends JpaRepository<RedeAtencaoModel, String> {
}
