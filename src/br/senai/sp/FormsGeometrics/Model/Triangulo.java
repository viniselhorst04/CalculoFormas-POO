package br.senai.sp.FormsGeometrics.Model;

public class Triangulo {

    public double base;
    public double altura;

    public double resultadoarea;
    public double resultadoperimetro;


    public void CalcularTriangulo(){

        System.out.println("\nCalculando.....\n");

        resultadoarea = (base * altura)/2;
        resultadoperimetro = base + (altura*2);

    }

}
