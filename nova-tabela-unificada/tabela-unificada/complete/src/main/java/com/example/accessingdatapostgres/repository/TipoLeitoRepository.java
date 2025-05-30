package com.example.accessingdatapostgres.repository;

import com.example.accessingdatapostgres.model.TipoLeitoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoLeitoRepository extends JpaRepository<TipoLeitoModel, String> {
}
