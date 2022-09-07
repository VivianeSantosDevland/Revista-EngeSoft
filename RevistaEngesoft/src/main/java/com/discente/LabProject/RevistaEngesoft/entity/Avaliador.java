package com.discente.LabProject.RevistaEngesoft.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity(name = "tabela_avaliador")
@Table(name = "tabela_avaliador")
@NoArgsConstructor
public class Avaliador {
    @Id
    @GeneratedValue
    @Column(name="id_avaliador")
    BigInteger id;
    @Column(name="nome_avaliador")
    String nome;
    @Column(name="email_avaliador")
    String email;

    @ManyToMany
    @JoinTable(name="tabela_avaliador_has_tabela_tema", joinColumns=
            {@JoinColumn(name="id_avaliador")}, inverseJoinColumns=
            {@JoinColumn(name="id_tema")})
    private List<Tema> temas = new ArrayList<>();
/*
    @OneToMany
    @JoinColumn(name = "id_avaliador")
    private  List<Avaliacao> avaliacoes = new ArrayList<>();



 */
    /*

    Avaliador-chefe? Artigo foi aprovado? edicao vai ser lançada?
    criar um atributo para identificar se o avaliador é chefe da edição, nesse
    caso id_avaliadorChefe deve ir para seleção
     */

}
