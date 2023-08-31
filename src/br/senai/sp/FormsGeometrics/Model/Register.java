package br.senai.sp.FormsGeometrics.Model;

import java.util.Scanner;

public class Register {

    Scanner teclado = new Scanner(System.in);

    public Quadrado InformacoesQuadrado(){

        Quadrado quadrado = new Quadrado();

        //Pedido de Informaçoes
        System.out.println("------------------------ Calculo do Quadrado -------------------------");
        System.out.println("Para o calculo vamos precisar das seguintes informações abaixo: ");
        System.out.print("Lado 1: ");
        quadrado.lado1 = teclado.nextDouble();
        System.out.print("Lado 2: ");
        quadrado.lado2 = teclado.nextDouble();
        System.out.println("-------------------------                    --------------------------");

        return quadrado;



    }

    public Triangulo InformacoesTriangulo(){

        Triangulo triangulo = new Triangulo();

        //Pedido de Informaçoes
        System.out.println("------------------------ Calculo do Triagulo -------------------------");
        System.out.println("Para o calculo vamos precisar das seguintes informações abaixo: ");
        System.out.print("Base do Triangulo: ");
        triangulo.base = teclado.nextDouble();
        System.out.print("Altura do Triangulo: ");
        triangulo.altura = teclado.nextDouble();
        System.out.println("-------------------------                    --------------------------");

        return triangulo;
    }


    public Retangulo InformacoesRetangulo(){
    Retangulo retangulo = new Retangulo();

    //Pedido de Informaçoes
        System.out.println("------------------------ Calculo do Retangulo -------------------------");
        System.out.println("Para o calculo vamos precisar das seguintes informações abaixo: ");
        System.out.print("Lado1 do Retangulo: ");
        retangulo.lado1 = teclado.nextDouble();
        System.out.print("Lado2 do Retangulo: ");
        retangulo.lado2 = teclado.nextDouble();
        System.out.println("-------------------------                    --------------------------");

        return retangulo;

    }


    public Circulo InformacoesCirculo(){
        Circulo circulo = new Circulo();

        //Pedido de Informaçoes
        System.out.println("------------------------ Calculo do Circulo -------------------------");
        System.out.println("Para o calculo vamos precisar das seguintes informações abaixo: ");
        System.out.print("Raio do Circulo: ");
        circulo.raio = teclado.nextDouble();

        return circulo;

    }

}
