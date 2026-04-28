package com;

 class Conta {

    private float saldo;

    public float getSaldo(){

        return saldo;
    }

    public void setSaldo(float saldo){

        this.saldo = saldo;

    }

    public void Depositar(float valor){

        saldo += valor;
    }

    public void Levantamento(float valor){

        if (valor <= saldo) {

        saldo -= valor;
    
}
    else{

        System.out.println("saldo insuficiente");

}

    }
    


  public static void main(String[] args) {

    Conta C = new Conta();
        C.Depositar(100);

        System.out.println("saldo: "+ C.getSaldo());


    }}
