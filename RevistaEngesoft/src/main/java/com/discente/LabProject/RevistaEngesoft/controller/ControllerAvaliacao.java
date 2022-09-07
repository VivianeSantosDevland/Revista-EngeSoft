package com.discente.LabProject.RevistaEngesoft.controller;

import com.discente.LabProject.RevistaEngesoft.entity.Artigo;
import com.discente.LabProject.RevistaEngesoft.entity.Avaliacao;
import com.discente.LabProject.RevistaEngesoft.repository.RepositoryAvaliacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/Avaliacao")
public class ControllerAvaliacao {

    @Autowired
    RepositoryAvaliacao objRepositoryAvaliacao;

    @PostMapping(value = "/salvarAvaliacao")
    public void salvarAvaliacao(@RequestBody Avaliacao avaliacao)
    {
        objRepositoryAvaliacao.save(avaliacao);
    }

    @PostMapping(value = "/atualizarAvaliacao")
    public void atualizarAvaliacao(@RequestBody Avaliacao avaliacao)
    {
        objRepositoryAvaliacao.save(avaliacao);
    }

    @RequestMapping(value ="/listarAvaliacoes")
    public List<Avaliacao> listar()
    {
        List<Avaliacao> avaliacoes = objRepositoryAvaliacao.findAll();
        /*int i;
        String nomeArtigo = null;

        for(i = 0; i < artigos.size(); i++)
        {
            nomeArtigo +=  artigos.get(i).getTitulo();
        }

         */
        return avaliacoes;
    }
    //listar artigos em avaliacao


    //listar artigos já avaliados
    @RequestMapping(value ="/listarArtigosAvaliados")
    public List<Avaliacao> listarArtigosAvaliados()
    {
        List<Avaliacao> avaliacoes = objRepositoryAvaliacao.findArtigosAvaliados();

        return avaliacoes;
    }

    @DeleteMapping(value ="/deletarAvaliacao")
    public void deletarArtigo(@RequestParam BigInteger id)
    {
        objRepositoryAvaliacao.deleteById(id);
    }

}
