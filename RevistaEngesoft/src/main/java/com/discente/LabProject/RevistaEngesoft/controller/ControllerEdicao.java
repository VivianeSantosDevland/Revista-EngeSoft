package com.discente.LabProject.RevistaEngesoft.controller;

import com.discente.LabProject.RevistaEngesoft.entity.Edicao;
import com.discente.LabProject.RevistaEngesoft.repository.RepositoryEdicao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/Edicao")
public class ControllerEdicao {

    @Autowired
    RepositoryEdicao objRepositoryEdicao;

    @PostMapping(value = "/salvarEdicao")
    public void criarEdicao(@RequestBody Edicao edicao)
    {
        objRepositoryEdicao.save(edicao);
    }

    @DeleteMapping(value ="/deletarEdicao")
    public void deletarEdicao(@RequestParam BigInteger id)
    {
        objRepositoryEdicao.deleteById(id);
    }

    @PutMapping(value = "/atualizarEdicao")
    public void atualizarEdicao(@RequestBody Edicao edicao)
    {
        objRepositoryEdicao.save(edicao);
    }

    @RequestMapping(value ="/listarEdicoes")
    public List<Edicao> listarEdicoes()
    {
        List<Edicao> edicoes = objRepositoryEdicao.findAll();
        int i;
        BigInteger id = null;
        int numero;
        int volume;
        int mes;
        int ano;
        for(i = 0; i < edicoes.size(); i++)
        {
            id =  edicoes.get(i).getId();
            numero = edicoes.get(i).getNumero();
            volume = edicoes.get(i).getVolume();
            mes = edicoes.get(i).getMes();
            ano = edicoes.get(i).getAno();

        }
        return edicoes;
    }

}
