package com;

import javax.swing.JOptionPane;

public class TestarViaturas{
    public static void main(String[] args) {
        int  Escolha, KilometrosAtuais;
        String Matricula, Marca, Combustivel;
        float Preco;

        String[] Opcoes = { "Adicionar", "Eliminar", "Listagem", "Sair" };
        Dados D = new Dados();

        do {
            Escolha = JOptionPane.showOptionDialog(null,
                    "Selecione a sua opção",
                    "Gestão de viaturas",
                    JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, Opcoes, null);
            if (Escolha == 3)
                break;

            switch (Escolha) {
                case 0 -> {
                    Matricula = JOptionPane.showInputDialog(null,
                            "Digite a Matricula da viatura");

                    if(D.ViaturaJaExiste(Matricula)){

                        JOptionPane.showMessageDialog(null, "Matricula viatura já existe",
                "Adicionar viatura", JOptionPane.INFORMATION_MESSAGE);
                       
                    }
                    else{        
                    Marca = JOptionPane.showInputDialog(null,
                            "Digite a marca do viatura  \n");

                    Matricula = JOptionPane.showInputDialog(null,
                            "Digite a matricula viatura\n");

                    Combustivel=JOptionPane.showInputDialog(null,
                            "Digite o combustivel viatura\n");

                    Preco = Float.parseFloat(JOptionPane.showInputDialog(null,
                            "Digite o preco viatura\n"));

                    KilometrosAtuais = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite o kilometros viatura\n"));


                    Viaturas V = new Viaturas(Marca, Matricula, Combustivel, Preco,KilometrosAtuais);

                    //String Marca, String Matricula,  String Combustivel,float Preco,int KilometrosAtuais ){


                    D.AdicionarViaturas(V);
                }
                }
                case 1->{
                    Matricula = (JOptionPane.showInputDialog(null,
                            "Digite o número do aluno a eliminar"));
                    D.EliminarViatura(Matricula);   
                }
                case 2 -> D.ListagemViaturas();
            }

        } while (Escolha != 3);

    }
}