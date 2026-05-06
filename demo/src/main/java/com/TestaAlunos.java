package com;

import javax.swing.JOptionPane;

public class TestaAlunos {
    public static void main(String[] args) {
        int Numero, Escolha;
        String Nome, Email;
        String[] Opcoes = { "Adicionar", "Eliminar", "Listagem", "Sair" };
        DadosAlunos D = new DadosAlunos();

        do {
            Escolha = JOptionPane.showOptionDialog(null,
                    "Selecione a sua opção",
                    "Gestão de alunos",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, Opcoes, null);
            if (Escolha == 3)
                break;

            switch (Escolha) {
                case 0 -> {
                    Numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o número do aluno"));
                    if(D.AlunoJaExiste(Numero)){
                        JOptionPane.showMessageDialog(null, "Nº de aluno já existe",
                "Adicionar Aluno", JOptionPane.INFORMATION_MESSAGE);
                       
                    }
                    else{        
                    Nome = JOptionPane.showInputDialog(null,
                            "Digite o nome do aluno");
                    Email = JOptionPane.showInputDialog(null,
                            "Digite o emaildo aluno");
                    Alunos A = new Alunos(Numero, Nome, Email);
                    D.AdicionarAlunos(A);
                }
                }
                case 1->{
                    Numero = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o número do aluno a eliminar"));
                    D.EliminarAluno(Numero);    
                }
                case 2 -> D.ListagemAlunos();
            }

        } while (Escolha != 3);

    }
}