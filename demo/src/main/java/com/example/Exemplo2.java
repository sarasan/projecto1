package com.example;

 class Aluno {

    String nome;

    float nota;

    //metodo construtor

    Aluno(String nome, float nota){

    this.nome = nome;

    this.nota = nota;

    }


    //metodo para mostrar os dados

    void MostrarDados(){

        System.out.println(nome +"- Nota: "+ nota);
    }
 






    public static void main(String[] args) {

        Aluno A = new Aluno("SARA", 10);
        A.MostrarDados();


    }}



    

