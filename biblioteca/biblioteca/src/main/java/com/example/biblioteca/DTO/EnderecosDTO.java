package com.example.biblioteca.DTO;

import java.io.Serializable;

import com.example.biblioteca.models.Enderecos;

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

public class EnderecosDTO implements Serializable{ 

  private static final long serialVersionUID = 1L; 
  @Id 

  @GeneratedValue (strategy = GenerationType.IDENTITY) 
  
  private long id;
  private String cep;
  private String bairro;
  private String rua;
  private String cidade;
  private String estado;
  private String numero;

  public EnderecosDTO( Enderecos entity){
    this.id = entity.getId();
    this.cep = entity.getCep();
    this.bairro = entity.getBairro();
    this.rua = entity.getRua();
    this.cidade = entity.getCidade();
    this.estado = entity.getEstado();
    this.numero = entity.getNumero();
  }

}
