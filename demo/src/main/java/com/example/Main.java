package com.example;

import javax.swing.JOptionPane;

class Pessoa{

    String nome;

    int idade;

    void MostrarDados(){

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);
    }
}



public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

//instancia objecto
        Pessoa P = new Pessoa();

        P. nome = "sara";

        

        P.idade = 34;

        P.MostrarDados();
    }
}