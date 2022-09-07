package com.discente.LabProject.RevistaEngesoft.repository;

import com.discente.LabProject.RevistaEngesoft.entity.Avaliador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

public interface RepositoryAvaliador extends JpaRepository <Avaliador, Long> {

    @Transactional
    void deleteById(BigInteger id);
}
