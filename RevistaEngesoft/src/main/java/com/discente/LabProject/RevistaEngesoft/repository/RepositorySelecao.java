package com.discente.LabProject.RevistaEngesoft.repository;

import com.discente.LabProject.RevistaEngesoft.entity.Selecao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface RepositorySelecao extends JpaRepository<Selecao, Long> {
    void deleteById(BigInteger id);
}
