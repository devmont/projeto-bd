package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.SiaSihModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiaSihRepository extends JpaRepository<SiaSihModel, String> {
}
