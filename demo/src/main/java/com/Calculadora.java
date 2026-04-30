package com;

public class Calculadora {

    private float Numero1;

    private float Numero2;



    public float getNumero1(){

        return Numero1;
    }

    public void setNumero1(float Numero1){

        this.Numero1 = Numero1;
    }


     public float getNumero2(){

        return Numero2;
    }

    public void setNumero2(float Numero2){

        this.Numero2 = Numero2;


    }

    public float Somar(float num1, float num2){

        float soma = num1 + num2;

        return soma;
    }


    public float Subtrair(float num1, float num2){

        float subtracao = num1 - num2;

        return subtracao;
    }



    public float Multiplicar(float num1, float num2){

        float multiplicacao = num1 * num2;

        return multiplicacao;
    }


    public float Dividir(float num1, float num2){

        float divisao = num1 / num2;

        return divisao;
    }


    


}

    
    

