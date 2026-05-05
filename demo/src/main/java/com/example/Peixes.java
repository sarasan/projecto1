package com.example;

import javax.swing.JOptionPane;

public class Peixes extends Animais{
    private String Caracteristicas;

    public Peixes(String Nome, String Cor, String Ambiente,
    float Comprimento, float Velocidade, int Patas, String Caracteristicas){
        super(Nome, Cor, Ambiente, Comprimento, Velocidade, Patas);
        this.Caracteristicas=Caracteristicas;
    }

    public String getCaracteristicas(){
        return(this.Caracteristicas);
    }
    public void setCaracteristicas(String Caracteristicas){
        this.Caracteristicas=Caracteristicas;
    }
    public void DadosPeixes(){
        super.MostraDados();
        JOptionPane.showMessageDialog(null, "Caracteristicas:"+
        this.Caracteristicas,"Classe Peixes",JOptionPane.INFORMATION_MESSAGE);
    }
}
