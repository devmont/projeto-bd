package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.TussModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TussRepository extends JpaRepository<TussModel, String> {
}
