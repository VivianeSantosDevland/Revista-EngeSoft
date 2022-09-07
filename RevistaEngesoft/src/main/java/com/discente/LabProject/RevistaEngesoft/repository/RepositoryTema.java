package com.discente.LabProject.RevistaEngesoft.repository;

import com.discente.LabProject.RevistaEngesoft.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

public interface RepositoryTema extends JpaRepository<Tema, Long> {

    @Transactional
    void deleteById(BigInteger id);
}
