package com;

import javax.swing.JOptionPane;

public class Veiculo {

    private String marca;

    private String modelo;

    private int ano;

    private float preco;

    private String combustivel;

    private int velocidade_maxima;


    public Veiculo(String marca, String modelo, int ano, float preco, String combustivel, int velocidade_maxima){

        this.marca = marca;

        this.modelo = modelo;

        this.ano = ano;

        this.preco = preco;

        this.combustivel = combustivel;

        this.velocidade_maxima = velocidade_maxima;

    }
    public String getMarca(){

        return(this.marca);

    }
    public void setMarca(String marca){

        this.marca = marca;

}

    public String getModelo(){

        return(this.modelo);

    }

    public void setModelo(String modelo){
        
        this.modelo = modelo;

}

   public int getAno(){

        return(this.ano);

    }

    public void setAno(int ano){
        
        this.ano = ano;

}

    public float getPreco(){

        return (this.preco);
}


    public void setPreco(float preco){

        this.preco = preco;
    }

    public String getCombustivel(){

        return (this.combustivel);
    }

    public void setCombustivel(String combustivel){

        this.combustivel = combustivel;
    }

    public int getVelocidadeMaxima(int velocidade_maxima){

        return (this.velocidade_maxima);
    }

    public void MostrarDados(){

        JOptionPane.showMessageDialog(null, 
        "Marca:"+this.marca+
        "\nModelo:"+this.modelo+
        "\nAno:"+this.ano+
        "\nCombustivel:"+this.combustivel+
        "\nVelocidade:"+this.velocidade_maxima+
        "\nPreço:"+this.preco,"Classe Animais",JOptionPane.INFORMATION_MESSAGE
        );
    }

}
