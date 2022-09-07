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
@Entity
@Table(name = "tabela_avaliacao")
public class Avaliacao {
   @Id
   @GeneratedValue
   @Column(name = "id_avaliacao")
    BigInteger id;
    @Column(name = "originalidade_avaliacao")
    int originalidade;
    @Column(name = "conteudo_avaliacao")
    int conteudo;
    @Column(name = "apresentacao_avaliacao")
    int apresentacao;
    @Column(name = "status_avaliacao")
    String status;
    @OneToOne(cascade = CascadeType.MERGE)
    private Avaliador avaliador;
    @OneToOne(cascade=CascadeType.MERGE)
    private Artigo artigo;
 /*
  @ManyToMany(cascade = CascadeType.MERGE)
 @JoinTable(name="tabela_avaliacao_has_tabela_avaliador", joinColumns=
         {@JoinColumn(name="id_avaliacao")}, inverseJoinColumns=
         {@JoinColumn(name="id_avaliador")})*/

/*
 @ManyToMany(cascade = CascadeType.MERGE)
 @JoinTable(name="tabela_avaliacao_has_tabela_artigo", joinColumns=
         {@JoinColumn(name="id_avaliacao")}, inverseJoinColumns=
         {@JoinColumn(name="id_artigo")}) */

    /*@Column(name = "id_avaliador")
    BigInteger idAvaliador;
    @Column(name = "id_artigo")
    BigInteger idArtigo; */

    /*relacionamento com a entidade avaliador
    @OneToMany
    @JoinColumn(name = "id_avaliador")
    private List<Avaliador> avaliadores = new ArrayList<>();

    /*Uma avaliação de uma artigo é feita por 3 avaliadores. Mas 1 avaliador pode avaliar mais de um artigo para uma edição
    nesse caso, o correto não seria Muitos avaliadores para muitas avaliações?
  criar uma regra de negócio para verificar se o avaliador já avaliou o artigo.
um artigo pode ter três linhas em avaliação, mas o mesmo avaliador só pode ter uma linha para o mesmo artigo
 */
 //no ManyToOne o Jpa cria o nome das colunas na classe que o usa automaticamente
    /* @ManyToOne
     @JoinColumn(name = "id_avaliador")
     private Avaliador avaliador;



     @ManyToOne
     @JoinColumn(name = "id_artigo")
     private Artigo artigo;*/
  //relacionamento com a entidade artigo
   /*@OneToMany
   @JoinColumn(name = "id_artigo")
   private List<Artigo> artigos = new ArrayList<>();

    */
}
