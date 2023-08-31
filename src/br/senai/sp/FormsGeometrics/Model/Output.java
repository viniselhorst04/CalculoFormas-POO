package br.senai.sp.FormsGeometrics.Model;

public class Output {


    public void ResultadosQuadrado(Quadrado quadrado){

        // Resultados
        System.out.println(" A àrea do Quadrado é: " + quadrado.resultadoarea);
        System.out.println(" A perimetro do Quadrado é: " + quadrado.resultadoperimetro);
        System.out.println("\n------------------------------------------------------------");

    }

    public void ResultadosTriangulo(Triangulo triangulo){

        // Resultados
        System.out.println(" A àrea do Triangulo é: " + triangulo.resultadoarea);
        System.out.println(" A perimetro do Triangulo é: " + triangulo.resultadoperimetro);
        System.out.println("\n------------------------------------------------------------");

    }

    public void ResultadosRetangulo(Retangulo retangulo){

        // Resultados
        System.out.println(" A àrea do Retangulo é: " + retangulo.resultadoarea);
        System.out.println(" A perimetro do Retangulo é: " + retangulo.resultadoperimetro);
        System.out.println("\n------------------------------------------------------------");

    }

    public void ResultadosCirculo(Circulo circulo){

        // Resultados
        System.out.println(" A àrea do Circulo é: " + circulo.resultadoarea);
        System.out.println(" A perimetro do Circulo é: " + circulo.resultadoprimeiro);
        System.out.println("\n------------------------------------------------------------");

    }

}
