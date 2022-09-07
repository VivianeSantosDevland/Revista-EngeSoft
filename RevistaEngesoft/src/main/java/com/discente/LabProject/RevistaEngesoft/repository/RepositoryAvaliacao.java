package com.discente.LabProject.RevistaEngesoft.repository;

import com.discente.LabProject.RevistaEngesoft.entity.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.List;

public interface RepositoryAvaliacao extends JpaRepository <Avaliacao, Long> {
    void deleteById(BigInteger id);

    @Query(value = "select *from tabela_avaliacao where status_avaliacao = 'Avaliado'", nativeQuery = true)
    List<Avaliacao> findArtigosAvaliados();
}
