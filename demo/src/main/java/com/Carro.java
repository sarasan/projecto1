package com;

import javax.swing.JOptionPane;

public class Carro extends Veiculo {

    private int portas;

    public Carro(String marca, String modelo, int ano, float preco, String combustivel, int velocidade_maxima, int portas) {

        super(marca, modelo, ano, preco, combustivel,velocidade_maxima);

        this.portas = portas;
    }

    public int getPortas() {

        return (this.portas);
    }

    public void setPortas(int portas) {

        this.portas = portas;
    }

    public void MostrarDadosCarro() {
        super.MostrarDados();
        JOptionPane.showMessageDialog(null, "portas:" +
                this.portas, "Classe Carro", JOptionPane.INFORMATION_MESSAGE);
    }
}
