package com.example;

import javax.swing.JOptionPane;

public class TestaAnimais {
    public static void main(String[] args) {
        String[] Operacoes = { "Animais", "Peixes", "Mamiferos", "Sair" };
        int Escolha = 0;

        do {
            Escolha = JOptionPane.showOptionDialog(null,
                    "Selecione a operação", "Herança",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, Operacoes, null);

            if (Escolha == 3)
                break;

            switch (Escolha) {
                case 0 -> {
                    Animais A = new Animais("Camelo", "Amarelo", "Deserto",
                            200, 2, 4);
                    A.MostraDados();
                }
                case 1 -> {
                    Peixes P = new Peixes("Tubarão", "Cinza", "Oceano", 300,
                            1.5f, 0, "Barbatanas");
                    P.DadosPeixes();
                }
                case 2 -> {
                    Mamiferos M = new Mamiferos("Canguru", "Amarelo",
                            "Terra", 120, 13, 4, "Fruta");
                    M.DadosMamiferos();
                }
            }

        } while (Escolha != 3);
    }
}
