package com.example;

import javax.swing.JOptionPane;

import com.Calculadora;


public class Main {
    public static void main(String[] args) {
         
        Calculadora calc = new Calculadora();

     
        String input = JOptionPane.showInputDialog("Por favor insira o primeiro numero:");
 
        try {

            int number = Integer.parseInt(input);

           String input2 = JOptionPane.showInputDialog("Por favor insira o segundo numero:");

            int number2 = Integer.parseInt(input2);

            JOptionPane.showMessageDialog(null, "Inseriu os seguintes numeros: " + number + " e " + number2);

            String option = JOptionPane.showInputDialog("Por favor escolha a operaçao pretendida:\n1:Somar\n2:Subtrair\n3:Multiplicar\n4:Dividir");

        
            switch (option) {

                case "1":

                    JOptionPane.showMessageDialog(null, "Soma: " +  calc.Somar(number,number2) );

                    break;

                    case "2":

                    JOptionPane.showMessageDialog(null, "Subtraçao: " +  calc.Subtrair(number,number2) );
                    
                    break;

                    case "3":
                    
                    JOptionPane.showMessageDialog(null, "Multiplicaçao: " +  calc.Multiplicar(number,number2) );
                    
                    break;

                    case "4":
                        
                    JOptionPane.showMessageDialog(null, "Multiplicaçao: " +  calc.Multiplicar(number,number2) );
                    
                    break;
            
                default:
                
            }


        } catch (NumberFormatException e) {

           
        JOptionPane.showMessageDialog(null, "Entrada invalida. Por favor insira um inteiro valido.");
        }
    }
}
    


    
