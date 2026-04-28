package com.example;

import javax.swing.JOptionPane;

import com.Calculadora;

/*class Pessoa{

    String nome;

    int idade;

    void MostrarDados(){

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);
    }
}*/



public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

//instancia objecto
        /*Pessoa P = new Pessoa();

        P. nome = "sara";

        //String name = JOptionPane.showInputDialog("What is your name?");


        P.idade = 34;

        P.MostrarDados();*/


         /*float Numero1 = JOptionPane.showInputDialog("Introduza o primeiro numero:");
        
        // Create a JOptionPane to display a message with a personalized greeting
      
        JOptionPane.showMessageDialog(null, "GFG " + Numero1 + "!");

           float Numero2 = JOptionPane.showInputDialog("Introduza o primeiro numero:");
        
        // Create a JOptionPane to display a message with a personalized greeting
      
        JOptionPane.showMessageDialog(null, "GFG " + Numero1 + "!");*/

        ////////////////////////////////////////
        /// 
        /// 
        Calculadora calc = new Calculadora();

     
        String input = JOptionPane.showInputDialog("Please enter first integer:");
 
        //try {
            // Convert the string to an integer
            int number = Integer.parseInt(input);

           String input2 = JOptionPane.showInputDialog("Please enter first integer:");

            int number2 = Integer.parseInt(input2);

            // Display the result
            JOptionPane.showMessageDialog(null, "You entered: " + number + "and" + number2);

            String option = JOptionPane.showInputDialog("Please choose the  operation:1\n1:Somar\n2:Subtrair\n3:Multiplicar\n4:Dividir");

        //} catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            //JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");

            switch (option) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Soma: " +  calc.Somar(number,number2) );

                    
                    break;

                    case "2":
                     calc.Subtracao(number, number2);
                    
                    break;

                    case "3":
                     calc.Multiplicar(number,number2);
                    
                    break;

                    case "4":
                     calc.Dividir(number,number2);
                    
                    break;
            
                default:
                    break;
            }
        }
    }


    
