package com.discente.LabProject.RevistaEngesoft.service;

import com.discente.LabProject.RevistaEngesoft.entity.Artigo;
import com.discente.LabProject.RevistaEngesoft.repository.RepositoryArtigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ServiceArtigo{
    @Autowired
    RepositoryArtigo objRepositoryArtigo;
    public Page<Artigo> findAll()
    {
        int page = 0;
        int size = 10;
        PageRequest pageRequest = PageRequest.of(page, size, Sort.Direction.ASC, "titulo_artigo");
        return new PageImpl<>(objRepositoryArtigo.findAll(), pageRequest, size);

    }
}
