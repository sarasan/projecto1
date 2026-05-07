package com;

//import javax.swing.JOptionPane;

public class Viaturas {

    private String Marca;

    private String Matricula;

    private String Combustivel;

    private int KilometrosAtuais;

    private float Preco;

    public Viaturas(String Marca, String Matricula, String Combustivel, float Preco, int KilometrosAtuais) {

        this.Marca = Marca;

        this.Matricula = Matricula;

        this.Combustivel = Combustivel;

        this.KilometrosAtuais = KilometrosAtuais;

        this.Preco = Preco;

    }

    public String getMarca() {

        return (this.Marca);

    }

    public void setMarca(String Marca) {

        this.Marca = Marca;

    }

    public String getMatricula() {

        return (this.Matricula);

    }

    public void setMatricula(String Matricula) {

        this.Matricula = Matricula;

    }

    public String getCombustivel() {

        return (this.Combustivel);
    }

    public void setCombustivel(String Combustivel) {

        this.Combustivel = Combustivel;

    }

    public float getPreco() {

        return (this.Preco);
    }

    public void setPreco(float Preco) {

        this.Preco = Preco;
    }

    public int getKilometrosAtuais() {

        return (this.KilometrosAtuais);

    }

    public void setKilometrosAtuais(int KilometrosAtuais) {

        this.KilometrosAtuais = KilometrosAtuais;
    }

}
