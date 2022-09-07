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
@Entity(name = "tabela_tema")
@Table(name="tabela_tema")
@NoArgsConstructor
public class Tema {


    @Id
    @Column(name="id_tema")
    @GeneratedValue
    BigInteger id;
    @Column(name="descricao_tema")
    String descricaoTema;

    @OneToMany
    @JoinColumn(name = "id_tema")
    private List<Edicao> edicoes = new ArrayList<>();
}
