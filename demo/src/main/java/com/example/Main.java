package com.example;

import javax.swing.JOptionPane;

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

     
        String input = JOptionPane.showInputDialog("Please enter an integer:");
 
        try {
            // Convert the string to an integer
            int number = Integer.parseInt(input);
            // Display the result
            JOptionPane.showMessageDialog(null, "You entered: " + number);
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid integer
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
        }
    }
} 

    
