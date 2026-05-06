package com;

public class Alunos {
    private int Numero;
    private String Nome, Email;
   
    public Alunos(int numero, String nome, String email) {
        Numero = numero;
        Nome = nome;
        Email = email;
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

}
