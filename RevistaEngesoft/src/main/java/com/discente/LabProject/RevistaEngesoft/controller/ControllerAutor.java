package com.discente.LabProject.RevistaEngesoft.controller;

import com.discente.LabProject.RevistaEngesoft.entity.Autor;
import com.discente.LabProject.RevistaEngesoft.repository.RepositoryAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/Autor")
public class ControllerAutor {

    @Autowired
    RepositoryAutor objRepositoryAutor;

    @RequestMapping("/teste")
    public ResponseEntity saudacao()
    {
        return new ResponseEntity("teste", HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/salvarAutor")
    public void salvarAutor(@RequestBody Autor autor)
    {
        objRepositoryAutor.save(autor);
    }

    @PutMapping(value = "/atualizarAutor")
    public void atualizarAutor(@RequestBody Autor autor)
    {
        objRepositoryAutor.save(autor);
    }

    @DeleteMapping(value = "/deletarAutor")
    public void deletarAutor(@RequestParam BigInteger id)
    {
        objRepositoryAutor.deleteById(id);
    }

    @RequestMapping(value = "/listarAutores")
    public List<Autor> listarAutores()
    {
        int i;
        BigInteger id;
        String nome = null;
        String nomeInstituicao = null;
        String enderecoInstituicao = null;
        //teste
        List<Autor> autores = objRepositoryAutor.findAll();
        for(i = 0; i < autores.size(); i++)
        {
            id = autores.get(i).getId();
            nome += autores.get(i).getNome();
            nomeInstituicao += autores.get(i).getNomeInstituicao();
            enderecoInstituicao += autores.get(i).getEnderecoInstituicao();

        }
        return autores;
    }
}
