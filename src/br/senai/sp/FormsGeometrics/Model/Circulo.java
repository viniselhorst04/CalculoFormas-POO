package br.senai.sp.FormsGeometrics.Model;

public class Circulo {

    public double raio;
    public double resultadoarea;
    public double resultadoprimeiro;

    public void CalcularCirculo(){

        System.out.println("\nCalculando.....\n");
        resultadoarea = 3.14 * (raio*raio);
        resultadoprimeiro = (3.14*2) * raio;

    }

}
