# Exemplo de Métodos Acessores (Getters), Métodos Modificadores (Setters), Métodos Construtores (Construct).

Classe Caneta
  public modelo: Caractere
  privado ponta: Real
  
  public Metodo getModelo()
    retorne modelo
  FimMetodo
   
  public Metodo setModelo
    (m: Caractere)
    modelo = m
  FimMetodo
   
  public Metodo getPonta()
    retorne ponta
  FimMetodo
  
  public Metodo setPont
    (p: Real)
    ponta = p
  FimMetodo
 FimClasse
 
 //Chamada para setters
 c1 = nova Caneta
 c1.setModelo("BIC Cristal")
 c1.setPonta(0.5)
 
 //Chamada para getters
 Escreva(c1.getModelo())
 Escreva(c1.getPonta())
