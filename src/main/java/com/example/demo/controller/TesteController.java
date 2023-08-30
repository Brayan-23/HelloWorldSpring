package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class TesteController {

  @GetMapping
  public String hello(){
    return "Hello World";
  }

  @GetMapping("/bsm")
  public String bsms(){
    return "Lista de BSM's:"
        + "\nPersistência"
        + "\nResponsabilidade Pessoal"
        + "\nOrientação ao Futuro"
        + "\nHabilidades Comportamentais e Mentalidades"
        + "\nResponsabilidade Pessoal"
        + "\nComunicação"
        + "\nOrientação ao Detalhe"
        + "\nProatividade"
        + "\nTrabalho em Equipe"
        + "\nMentalidade de Crescimento";
  }

  @GetMapping("/objectives")
  public String objectivesWeek(){
    return "Lista de Objetivos da Semana"
        + "\nRealizar os Exercicios"
        + "\nConstruir um projeto inicial Spring"
        + "\nIntegrar JPA com meu Banco de Dados no Docker";
  }

}
