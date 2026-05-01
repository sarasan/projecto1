package com;

import javax.swing.JOptionPane;

public class Aviao extends Veiculo {

    private String tipodeAsa;

    public Aviao(String marca, String modelo, int ano, float preco, String combustivel, int velocidade_maxima,
            String tipodeAsa) {

        super(marca, modelo, ano, preco, combustivel, velocidade_maxima);

        this.tipodeAsa = tipodeAsa;
    }

    public String getTipodeAsa() {

        return (this.tipodeAsa);
    }

    public void setTipodeAsa(String tipodeAsa) {

        this.tipodeAsa = tipodeAsa;
    }

    public void MostrarDadosAviao() {
        super.MostrarDados();
        JOptionPane.showMessageDialog(null, "tipodeAsa:" +
                this.tipodeAsa, "Classe Aviao", JOptionPane.INFORMATION_MESSAGE);
    }

}
