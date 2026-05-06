package com;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Dados {

    private ArrayList<Viaturas> ListaViaturas = new ArrayList<>();

    public boolean ViaturaJaExiste(String Matricula) {

        for (Viaturas y : ListaViaturas) {
            if (y.getMatricula() == Matricula) {
                return (true);
            }
        }
        return (false);
    }

    public void AdicionarViaturas(Viaturas V) {
        ListaViaturas.add(V);
        JOptionPane.showMessageDialog(null, "Viatura adicionada.",
                "Adicionar Viatura", JOptionPane.INFORMATION_MESSAGE);
    }

    public void ListagemViaturas() {
        if (ListaViaturas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem viaturas",
                    "Listagem de Viaturas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String SaidaViaturas = "";
        for (int i = 0; i < ListaViaturas.size(); i++) {
            Viaturas V = ListaViaturas.get(i);
            SaidaViaturas += "\nMarca:" + V.getMarca() + " | \nMatricula:" + V.getMatricula() +
                    " | \nCombustivel:" + V.getCombustivel() + "Kilometros Atuais:  " + V.getKilometrosAtuais() +
                    " | \npreco:" +
                    V.getPreco();
        }
        JOptionPane.showMessageDialog(null, SaidaViaturas,
                "Listagem de Viaturas", JOptionPane.INFORMATION_MESSAGE);
    }

    public void ListagemViaturasPorMarca() {
        if (ListaViaturas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem viaturas",
                    "Listagem de Viaturas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String SaidaPorMarca = "";
        for (int i = 0; i < ListaViaturas.size(); i++) {
            Viaturas V = ListaViaturas.get(i);
            SaidaPorMarca += "\nMarca:" + V.getMarca();
        }
        JOptionPane.showMessageDialog(null, SaidaPorMarca,
                "Listagem de Viaturas", JOptionPane.INFORMATION_MESSAGE);
    }

    public void EliminarViatura(String Matricula) {
        for (int i = 0; i < ListaViaturas.size(); i++) {
            Viaturas V = ListaViaturas.get(i);
            if (V.getMatricula() == Matricula) {
                ListaViaturas.remove(i);
                JOptionPane.showMessageDialog(null, "Viatura eliminada",
                        "Eliminar viatura", JOptionPane.INFORMATION_MESSAGE);
                ;
            }else
        
        JOptionPane.showMessageDialog(null, "Matricula de viatura inexistente",
                "Eliminar viatura", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    public void ListagemTotPreco() {
        if (ListaViaturas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existem viaturas",
                    "Listagem de Viaturas", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String SaidaPorTPreco= "";
        for (int i = 0; i < ListaViaturas.size(); i++) {
            Viaturas V = ListaViaturas.get(i);
            SaidaPorTPreco += "\totalPrreco:" + V.getPreco();
        }
        JOptionPane.showMessageDialog(null, SaidaPorTPreco,
                "Listagem de Viaturas", JOptionPane.INFORMATION_MESSAGE);
    }
}

