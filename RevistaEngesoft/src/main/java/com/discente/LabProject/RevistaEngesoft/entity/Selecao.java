package com.discente.LabProject.RevistaEngesoft.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.security.x509.AVA;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@Entity(name = "tabela_selecao")
@Table(name = "tabela_selecao")
@NoArgsConstructor
public class Selecao {
    @Id
    @GeneratedValue
    @Column(name = "id_selecao")
    BigInteger id;
   /* @Column(name = "avaliadorChefeEdicao_selecao")
    BigInteger avaliadorChefe;
    @Column(name = "artigoAvaliado_selecao")
    BigInteger artigoAvaliado;
    @Column(name = "edicao_selecao")
    BigInteger  edicao;
    */
    //relacionamento com a tabela avaliação, avaliador "chefe", edição
    @OneToOne(cascade=CascadeType.MERGE)
    private Avaliador avaliadorChefe;
    //@OneToOne(cascade=CascadeType.MERGE)
    //private Avaliacao avaliacao;//seria a lista de artigos aprovados?
    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name="tabela_avaliacao_has_tabela_selecao", joinColumns=
            {@JoinColumn(name="id_avaliacao")}, inverseJoinColumns=
            {@JoinColumn(name="id_selecao")})
    private List<Avaliacao> artigosAvaliados = new ArrayList<>();
    @OneToOne(cascade=CascadeType.MERGE)
    private Edicao edicao;
}
