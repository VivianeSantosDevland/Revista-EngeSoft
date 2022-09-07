package com.discente.LabProject.RevistaEngesoft.controller;

import com.discente.LabProject.RevistaEngesoft.entity.Artigo;
import com.discente.LabProject.RevistaEngesoft.entity.Autor;
import com.discente.LabProject.RevistaEngesoft.repository.RepositoryArtigo;
import com.discente.LabProject.RevistaEngesoft.service.ServiceArtigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;


@RestController
@RequestMapping("/Artigo")
public class ControllerArtigo {

    @Autowired
     RepositoryArtigo objRepository;
    //@Autowired
    //ServiceArtigo objserviceArtigo;
    @RequestMapping("/saudacao")
    public ResponseEntity saudacao()
    {
        return new ResponseEntity ("Olá, seja bem vindo", HttpStatus.ACCEPTED);
    }


    @RequestMapping("")
        public String saudacao1()
        {
            return ("Olá, seja bem vindo");
        }


    @RequestMapping(value ="/listarArtigos")
    public List<Artigo> listar()
    {
      List<Artigo> artigos = objRepository.findAll();
      int i;
      String nomeArtigo = null;

      for(i = 0; i < artigos.size(); i++)
      {
          nomeArtigo +=  artigos.get(i).getTitulo();
      }
        return artigos;
    }

    @PostMapping(value = "/salvarArtigo")
    public void addArtigo(@RequestBody Artigo artigo)
    {
        objRepository.save(artigo);
    }


    @PutMapping(value = "/atualizarArtigo")
    public void atualizarArtigo(@RequestBody Artigo artigo)
    {
        objRepository.save(artigo);
    }

    //criar métodos para atualizar cada campo


    @DeleteMapping(value ="/deletarArtigo")
    public void deletarArtigo(@RequestParam BigInteger id)
    {
        objRepository.deleteById(id);
    }










  /*
    //buscar por nome do artigo
    @GetMapping(value = "/buscarNome")
    public List<Artigo> buscarNomeArtigo(@RequestParam String artigoNome)
    {
        int i;
        String nomeArtigo = null;
        List<Artigo> artigosNome = objRepository.findBy(artigoNome);
        for(i = 0; i < artigosNome.size(); i++)
        {
            nomeArtigo +=  artigosNome.get(i).getTitulo();
        }
        return artigosNome;
    }
    //buscar artigos por nome do autor



   */
    /*
    @PutMapping(value="/{id}")
    public ResponseEntity update(@PathVariable("id") BigInteger id,
                                 @RequestBody Artigo artigo) {
        return objRepository.findById(id)
                .map(record -> {
                    record.setTitulo(artigo.getTitulo());
                    record.setArquivoArtigo(artigo.getArquivoArtigo());
                    Artigo updated = objRepository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

     */
    /*
    @RequestMapping("/page")
    public Page<Artigo> pageArtigo()
    {
       return  objserviceArtigo.findAll();
    }

     */

        /*@GetMapping
    public List<Artigo> listarArtigos()
    {
        return objRepository.findAll();
    }*/


}
