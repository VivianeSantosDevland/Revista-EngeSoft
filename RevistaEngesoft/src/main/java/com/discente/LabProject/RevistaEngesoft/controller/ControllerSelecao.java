package com.discente.LabProject.RevistaEngesoft.controller;

import com.discente.LabProject.RevistaEngesoft.entity.*;
import com.discente.LabProject.RevistaEngesoft.repository.RepositorySelecao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/Selecao")
public class ControllerSelecao {
    /*
    Avaliador-chefe da edição seleciona artigos para ela(a edição)
     */

    @Autowired
    RepositorySelecao objRepository;

    @RequestMapping(value ="/listarSelecoes")
    public List<Selecao> listar()
    {
        List<Selecao> selecoes = objRepository.findAll();

        return selecoes;
    }

    @PostMapping(value = "/salvarSelecao")
    public void addSelecao(@RequestBody Selecao selecao)
    {
        objRepository.save(selecao);
    }


    @PutMapping(value = "/atualizarSelecao")
    public void atualizarSelecao(@RequestBody Selecao selecao)
    {
        objRepository.save(selecao);
    }

    //criar métodos para atualizar cada campo


    @DeleteMapping(value ="/deletarSelecao")
    public void deletarSelecao(@RequestParam BigInteger id)
    {
        objRepository.deleteById(id);
    }
}
