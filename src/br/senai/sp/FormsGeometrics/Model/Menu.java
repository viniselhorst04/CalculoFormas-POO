package br.senai.sp.FormsGeometrics.Model;

import java.util.Scanner;

public class Menu {

    public void Menu(){

        int opcao;

        Scanner teclado = new Scanner(System.in);

        Register register = new Register();
        Output resultado = new Output();

        System.out.println("------------------- BEM - VINDO AO APP CALCULA FORMAS -----------------");
        System.out.println("\n-- MENU --");
        System.out.println(" 1- Calcular Quadrado [Digite 1]");
        System.out.println(" 2- Calcular Triangulo [Digite 2]");
        System.out.println(" 3- Calcular Retangulo [Digite 3]");
        System.out.println(" 4- Calcular Circulo [Digite 4]");
        System.out.println(" 5- Sair [Digite 5]");
        opcao = teclado.nextInt();

        switch (opcao){

            case 1:
                Quadrado objQuadrado = register.InformacoesQuadrado();
                objQuadrado.CalcularQuadrado();
                resultado.ResultadosQuadrado(objQuadrado);
                break;
            case 2:
                Triangulo objTriangulo = register.InformacoesTriangulo();
                objTriangulo.CalcularTriangulo();
                resultado.ResultadosTriangulo(objTriangulo);
                break;
            case 3:
                Retangulo objRetangulo = register.InformacoesRetangulo();
                objRetangulo.CalcularRetangulo();
                resultado.ResultadosRetangulo(objRetangulo);
                break;
            case 4:
                Circulo objCirculo = register.InformacoesCirculo();
                objCirculo.CalcularCirculo();
                resultado.ResultadosCirculo(objCirculo);
                break;
            case 5:

                break;

        }





    }

}
