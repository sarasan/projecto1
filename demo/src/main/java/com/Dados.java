package com;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Dados {


private ArrayList<Viaturas> ListaViaturas = new ArrayList<>();

  public boolean ViaturaJaExiste(String Matricula){
        for(Viaturas x:ListaViaturas){
            if(x.getMatricula()==Matricula){
                return(true);             
            }
        }
        return(false);
    }

   public void AdicionarViaturas(Viaturas V) {
        ListaViaturas.add(V);
        JOptionPane.showMessageDialog(null, "Viatura adicionada.",
                "Adicionar Viatura", JOptionPane.INFORMATION_MESSAGE);
    }


     public void EliminarViatura(String Matricula) {
        for (int i = 0; i < ListaViaturas.size(); i++) {
            Viaturas V = ListaViaturas.get(i);
            if (V.getMatricula() == Matricula) {
                ListaViaturas.remove(i);
                JOptionPane.showMessageDialog(null, "Viatura eliminada",
                        "Eliminar viatura", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Matricula de viatura inexistente",
                "Eliminar viatura", JOptionPane.INFORMATION_MESSAGE);
    }


    public void ListagemViaturas() {
        if(ListaViaturas.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não existem viaturas",
                "Listagem de Viaturas", JOptionPane.INFORMATION_MESSAGE); 
                return;           
        }
        String Saida = "";
        for (int i = 0; i < ListaViaturas.size(); i++) {
            Viaturas V = ListaViaturas.get(i);
            Saida += "\nMarca:" + V.getMarca() + " | \nMatricula:" + V.getMatricula() +
                    " | \nCombustivel:" + V.getCombustivel() + " | \nKilometros actuais:" + 
                    V.getKilometrosAtuais() + ;
        }
        JOptionPane.showMessageDialog(null, Saida,
                "Listagem de Alunos", JOptionPane.INFORMATION_MESSAGE);
}}
/* private String Marca;

    private String Matricula;

   private String Combustivel;

    private int KilometrosAtuais;

    private float Preco; */


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
    



