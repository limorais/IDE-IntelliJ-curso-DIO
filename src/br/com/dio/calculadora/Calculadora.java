package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a, b;

        //solicitando entrada do usuario
        System.out.println("Digite o primeiro valor: ");
        //lendo primeira entrada e atribuindo a variavel a
        a = scan.nextDouble();
        // solicitando entrada do usuario
        System.out.println("Digite o segundo valor: ");
        // lendo primeira entrada e atribuindo a variavel b
        b = scan.nextDouble();

        // colocando as variaveis nos metodos
        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("A soma é: " + somar);
        System.out.println("A subtração é: " + subtrair);
        System.out.println("A multiplicação é: " + multiplicar);
        System.out.println("A divisão é: " + dividir);


    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }


}
