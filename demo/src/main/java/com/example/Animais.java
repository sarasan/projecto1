package com.example;

import javax.swing.JOptionPane;

public class Animais {
    private String Nome, Cor, Ambiente;
    private float Comprimento, Velocidade;
    private int Patas;

    public Animais(String Nome, String Cor, String Ambiente, float Comprimento,
    float Velocidade, int Patas){
        this.Nome=Nome;
        this.Cor=Cor;
        this.Ambiente=Ambiente;
        this.Comprimento=Comprimento;
        this.Velocidade=Velocidade;
        this.Patas=Patas;
    }
    public String getNome(){
        return(this.Nome);
    }
    public void setNome(String Nome){
        this.Nome=Nome;
    }
   public String getCor(){
        return(this.Cor);
    }
    public void setCor(String Cor){
        this.Cor=Cor;
    }    
   public String getAmbiente(){
        return(this.Ambiente);
    }
    public void setAmbiente(String Ambiente){
        this.Ambiente=Ambiente;
    } 
    public float getComprimento(){
        return(this.Comprimento);
    }
    public void setComprimento(float Comprimento){
        this.Comprimento=Comprimento;
    }     
   public float getVelocidade(){
        return(this.Velocidade);
    }
    public void setVelocidade(float Velocidade){
        this.Velocidade=Velocidade;
    }  
   public int getPatas(){
        return(this.Patas);
    }
    public void setPatas(int Patas){
        this.Patas=Patas;
    }    
    public void MostraDados(){
        JOptionPane.showMessageDialog(null, 
        "Nome:"+this.Nome+
        "\nCor:"+this.Cor+
        "\nAmbiente:"+this.Ambiente+
        "\nComprimento:"+this.Comprimento+
        "\nVelocidade:"+this.Velocidade+
        "\nPatas:"+this.Patas,"Classe Animais",JOptionPane.INFORMATION_MESSAGE
        );
    }               
}
