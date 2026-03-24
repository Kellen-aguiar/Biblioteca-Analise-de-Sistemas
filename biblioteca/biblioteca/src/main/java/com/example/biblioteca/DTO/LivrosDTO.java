package com.example.biblioteca.DTO;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.biblioteca.models.Livros;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LivrosDTO implements Serializable{ 

  private static final long serialVersionUID = 1L; 
  @Id 

  @GeneratedValue (strategy = GenerationType.IDENTITY)
  
  private long id; 
  private String titulo;
  private String autor;
  private String genero;
  private LocalDateTime insert;
  private LocalDate publicacao;

  public LivrosDTO(Livros entity){
    this.id = entity.getId();
    this.titulo = entity.getTitulo();
    this.autor = entity.getAutor();
    this.genero = entity.getGenero();
    this.insert = entity.getInsert();
    this.publicacao = entity.getPublicacao();
  }

}
