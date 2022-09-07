package com.discente.LabProject.RevistaEngesoft.repository;

import com.discente.LabProject.RevistaEngesoft.entity.Edicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

public interface RepositoryEdicao extends JpaRepository<Edicao, Long> {
    @Transactional
    void deleteById(BigInteger id);
}
