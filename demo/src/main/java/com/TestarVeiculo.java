package com;


public class TestarVeiculo {

    public static void main(String[] args){

    Veiculo jipe = new Veiculo("Range Rover", "XPTO 20",2000, 20.000f, "Gasoleo", 240);

    jipe.MostrarDados();

    Veiculo safari = new Veiculo("Safari", "Safari", 2000, 5000f, "Gasoleo", 250);

    safari.MostrarDados();

    Carro bolide = new Carro("Honda", "Civic",2004 , 15.000f, "Gasolina", 200, 5);
    
    bolide.MostrarDadosCarro();

    Aviao voar = new Aviao("Boing", "777", 2004, 400.000f, "Jet fuel", 950, "Fixa");
    
    voar.MostrarDadosAviao();
}
    
}
