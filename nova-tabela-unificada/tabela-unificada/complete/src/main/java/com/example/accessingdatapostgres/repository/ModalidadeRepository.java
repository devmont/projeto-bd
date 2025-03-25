package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.ModalidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadeRepository extends JpaRepository<ModalidadeModel, String> {
}
