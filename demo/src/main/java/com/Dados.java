package com;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Dados {


private ArrayList<Viaturas> ListaViaturas = new ArrayList<>();


   public void AdicionarViaturas(Viaturas V) {
        ListaViaturas.add(V);
        JOptionPane.showMessageDialog(null, "Viatura adicionada.",
                "Adicionar Viatura", JOptionPane.INFORMATION_MESSAGE);
    }
    
}


