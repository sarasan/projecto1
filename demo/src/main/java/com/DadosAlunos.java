package com;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DadosAlunos {
    private ArrayList<Alunos> Lista = new ArrayList<>();

    public boolean AlunoJaExiste(int Numero){
        for(Alunos x:Lista){
            if(x.getNumero()==Numero){
                return(true);             
            }
        }
        return(false);
    }

    // criar um método para adicionar os alunos ao array
    public void AdicionarAlunos(Alunos A) {
        Lista.add(A);
        JOptionPane.showMessageDialog(null, "Aluno adicionado.",
                "Adicionar Aluno", JOptionPane.INFORMATION_MESSAGE);
    }

    public void ListagemAlunos() {
        if(Lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem alunos",
                "Listagem de Alunos", JOptionPane.INFORMATION_MESSAGE); 
                return;           
        }
        String Saida = "";
        for (int i = 0; i < Lista.size(); i++) {
            Alunos A = Lista.get(i);
            Saida += "\nNumero:" + A.getNumero() + " | Nome:" + A.getNome() +
                    " | Email:" + A.getEmail();
        }
        JOptionPane.showMessageDialog(null, Saida,
                "Listagem de Alunos", JOptionPane.INFORMATION_MESSAGE);
    }

    public void EliminarAluno(int Numero) {
        for (int i = 0; i < Lista.size(); i++) {
            Alunos A = Lista.get(i);
            if (A.getNumero() == Numero) {
                Lista.remove(i);
                JOptionPane.showMessageDialog(null, "Aluno eliminado",
                        "Eliminar aluno", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Nº de aluno inexistente",
                "Eliminar aluno", JOptionPane.INFORMATION_MESSAGE);
    }
}
