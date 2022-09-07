package com.discente.LabProject.RevistaEngesoft.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tabela_artigo")
@Table(name = "tabela_artigo")
public class Artigo {
    @Id
    @GeneratedValue
    @Column (name = "id_artigo")
    BigInteger id;
    @Column (name = "titulo_artigo")
    String titulo;
    @Column (name = "arquivo_artigo")
    String arquivoArtigo;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name="tabela_artigo_has_tabela_autor", joinColumns=
            {@JoinColumn(name="id_artigo")}, inverseJoinColumns=
            {@JoinColumn(name="id_autor")})
    private List<Autor> autores = new ArrayList<>();

    //um artigo tem três linhas na tabela avaliação
  /*  @OneToMany
    @JoinColumn(name = "id_artigo")
        private List<Avaliacao> avaliacoes = new ArrayList<>(); */
    //Será que é assim??? Vey, eu preferia colocar o tal do id de edição e fim
@ManyToOne(cascade = CascadeType.MERGE)
@JoinColumn(name = "id_edicao")
private Edicao edicao;

}
