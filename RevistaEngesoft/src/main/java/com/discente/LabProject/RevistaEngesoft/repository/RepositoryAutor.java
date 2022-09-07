package com.discente.LabProject.RevistaEngesoft.repository;

import com.discente.LabProject.RevistaEngesoft.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;

public interface RepositoryAutor extends JpaRepository<Autor, Long> {
    @Transactional
    void deleteById(BigInteger id);
}
