package com.discente.LabProject.RevistaEngesoft.controller;

import com.discente.LabProject.RevistaEngesoft.entity.Avaliador;
import com.discente.LabProject.RevistaEngesoft.repository.RepositoryAvaliador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/Avaliador")
public class ControllerAvaliador  {
    @Autowired
    RepositoryAvaliador objRepositoryAvaliador;

    @PostMapping(value = "/salvarAvaliador")
    public void salvarAvaliador(@RequestBody Avaliador avaliador)
    {
        objRepositoryAvaliador.save(avaliador);
    }

    @PutMapping(value = "/atualizarAvaliadores")
    public void atualizarAvaliador(@RequestBody Avaliador avaliador)
    {
        objRepositoryAvaliador.save(avaliador);
    }
    @DeleteMapping(value = "deletarAvaliador")
    public void deletarAvaliador(@RequestParam BigInteger id)
    {
        objRepositoryAvaliador.deleteById(id);
    }

    @GetMapping(value = "/listarAvaliadores")
    public List<Avaliador> listarAvaliadores()
    {
        List<Avaliador> avaliadores = objRepositoryAvaliador.findAll();
        int i;
        String nome = null;
        String email = null;
        for(i = 0; i < avaliadores.size(); i++)
        {
            nome = avaliadores.get(i).getNome();
            email = avaliadores.get(i).getEmail();
        }
        return avaliadores;
    }
}
