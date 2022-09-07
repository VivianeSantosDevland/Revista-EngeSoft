package com.discente.LabProject.RevistaEngesoft.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigInteger;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tabela_autor")
@Table(name = "tabela_autor")
public class Autor {
    @Id
    @GeneratedValue
    @Column(name = "id_autor")
    BigInteger id;
    @Column(name = "nome_autor")
    String nome;
    @Column(name = "email_autor")
    String email;
    @Column(name = "instituicao_autor")
    String nomeInstituicao;
    @Column(name = "enderecoInstituicao_autor")
    String enderecoInstituicao;

}
