package com.company;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {

        int n;
        int resistencia = 0;
        int resistenciaEquivalente = 0;
        int menor = 0;
        int maior = 0;

        for (n = 0; n < 4; ++n) {
            Scanner resistencia_scanner = new Scanner(System.in);
            System.out.print("Digite o valor da resistência 1: ");
            resistencia = resistencia_scanner.nextInt();
            resistenciaEquivalente = resistenciaEquivalente + resistencia;
        }

        System.out.println("A resistência equivalente é: " +resistenciaEquivalente);

        if (n==0) {
            menor = resistencia;
            maior = resistencia;
            n++;
        }
        else if (resistencia < menor) {
            menor = resistencia;
        }
        else if (resistencia > maior) {
            maior = resistencia;
        }


        System.out.println("A menor resitência é: " +menor);
        System.out.println("A maior resitência é: " +maior);

    }

}

