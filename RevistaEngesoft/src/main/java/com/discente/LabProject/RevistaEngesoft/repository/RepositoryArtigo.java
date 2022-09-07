package com.discente.LabProject.RevistaEngesoft.repository;


import com.discente.LabProject.RevistaEngesoft.entity.Artigo;
import com.discente.LabProject.RevistaEngesoft.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.websocket.Session;
import java.math.BigInteger;
import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface RepositoryArtigo extends JpaRepository<Artigo, Long> {
    @Transactional
    void deleteById(BigInteger id);


}
