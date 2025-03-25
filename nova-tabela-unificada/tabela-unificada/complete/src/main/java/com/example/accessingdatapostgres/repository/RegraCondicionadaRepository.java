package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.RegraCondicionadaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegraCondicionadaRepository extends JpaRepository<RegraCondicionadaModel, String> {
}
