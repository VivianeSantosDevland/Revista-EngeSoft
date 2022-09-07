package com.discente.LabProject.RevistaEngesoft.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tabela_edicao")
@Table(name = "tabela_edicao")

public class Edicao {
    @Id
    @GeneratedValue
    @Column(name = "id_edicao")
    BigInteger id;
    @Column(name = "volume_edicao")
    int volume;
    @Column(name = "numero_edicao")
    int numero;
    @Column(name = "mes_edicao")
    int mes;
    @Column(name = "ano_edicao")
    int ano;
    @Column(name = "id_tema")
    BigInteger idTema;

/*
    @OneToMany
    @JoinColumn(name = "id_edicao")
    private List<Artigo> artigos = new ArrayList<>();

*/



}
