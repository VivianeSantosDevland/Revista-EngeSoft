package com.discente.LabProject.RevistaEngesoft.controller;

import com.discente.LabProject.RevistaEngesoft.entity.Tema;
import com.discente.LabProject.RevistaEngesoft.repository.RepositoryTema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/Tema")
public class ControllerTema {

    @Autowired
    RepositoryTema objRepositoryTema;

    @PostMapping(value = "/salvarTema")
    public void salvarTema(@RequestBody Tema tema)
    {
        objRepositoryTema.save(tema);
    }

    @DeleteMapping(value = "/deletarTema")
    public void deletarTema(@RequestParam BigInteger id)
    {
        objRepositoryTema.deleteById(id);
    }

    @PutMapping(value = "/atualizarTema")
    public void atualizarTema(@RequestBody Tema tema)
    {
        objRepositoryTema.save(tema);
    }

    @GetMapping(value = "/listarTemas")
    public List<Tema> listarTemas()
    {
        List<Tema> temas = objRepositoryTema.findAll();

        int i;
        BigInteger id = null;
        String descricaotema = null;
        //testando
        for(i = 0; i < temas.size(); i++)
        {
            id = temas.get(i).getId();
            descricaotema += temas.get(i).getDescricaoTema();
        }
        return temas;
    }
}
