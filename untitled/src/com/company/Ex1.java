package com.company;

import java.util.Scanner;

public class Ex1 {

    int idade;
    int contIdade = 0;
    int mediaIdade = 0;
    int cont = 0;

        void setMediaIdade() {

            System.out.println("\nExercício 1");

            do {
                Scanner lerIdade = new Scanner(System.in);
                System.out.println("\nDigite a idade: ");
                idade = lerIdade.nextInt();

                cont++;
                System.out.println("Já foram lida(s) " + cont + " idade(s)!");

                contIdade = contIdade + idade;

                mediaIdade = contIdade / cont;

                System.out.println("A média de idade é: " + mediaIdade);
            } while (mediaIdade <= 20);

        }

}
