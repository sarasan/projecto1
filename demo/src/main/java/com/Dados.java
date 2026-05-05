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

    /*2 - Crie uma classe Dados por forma a armazenar a informação:
▪ Possua um método para adicionar as viaturas ao array. Não é permitido inserir
matrículas repetidas.
▪ Possua um método para remover a viatura. A chave é a Matrícula.
▪ Possua um método para mostrar todas as viaturas.
▪ Possua um método para mostrar as viaturas por marca.
▪ Crie também um método para mostrar as viaturas apesentando no final o total do
campo Preco.
3- Crie uma classe TestarViaturas que possua um método main para testar os métodos
criados anteriormente recorrendo às caixas de diálogo como no exemplo mostrado na
aula. */
    
}


