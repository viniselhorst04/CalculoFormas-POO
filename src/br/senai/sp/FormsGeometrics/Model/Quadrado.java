package br.senai.sp.FormsGeometrics.Model;

public class Quadrado {

    public double lado1;
    public double lado2;
    public double resultadoarea;
    public double resultadoperimetro;


    public void CalcularQuadrado(){

        System.out.println("\nCalculando.....\n");

        // Calculo Quadrado
        resultadoarea = lado1 * lado2;
        resultadoperimetro = (lado1*2) + (lado2*2);



    }


}
