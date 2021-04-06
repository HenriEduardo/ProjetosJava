package com.company;

import java.util.Scanner;

public class Triangulo {

    int base;
    int altura;
    float area;

    public void lerDados() {

        Scanner lerBase = new Scanner(System.in);
        System.out.println("Digite a base do triângulo em cm: ");
        base = lerBase.nextInt();

        Scanner lerAltura = new Scanner(System.in);
        System.out.println("Digite a altura do triângulo: ");
        altura = lerAltura.nextInt();

    }

    public void calcularArea() {

        area = (base * altura) / 2;

    }

    public void exibirDados() {

        System.out.println("A base do triângulo é de " +base+ " cm!");
        System.out.println("A altura do triângulo é de " +altura+ " cm!");
        System.out.println("A área total do triângulo é de: " +area+ "cm!");

    }

}
