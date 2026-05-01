package com;

import org.w3c.dom.ranges.Range;

public class TestarVeiculo {

    public static void main(String[] args){

    Veiculo jipe = new Veiculo("Range Rover", "XPTO 20",2000, 20.000f, "Gasoleo", 240);

    jipe.MostrarDados();

    Carro bolide = new Carro("Honda", "Civic",2004 , 15.000f, "Gasolina", 200, 5);
    
    bolide.MostrarDadosCarro();

    Aviao voar = new Aviao("Boing", "777", 2004, 400.000f, "Jet fuel", 950, "Fixa");
    
    voar.MostrarDadosAviao();
}
    
}
