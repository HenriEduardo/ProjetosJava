package com.company;

import java.util.Scanner;

public class Ex3 {

    int num;
    int cont = 0;
    int somaNum = 0;
    int mediaNum = 0;

    void numero() {

        System.out.println("\nErcício 3");

        do {
            Scanner lerNum = new Scanner(System.in);
            System.out.println("\nDigite um número: ");
            num = lerNum.nextInt();

            cont++;

            somaNum = somaNum + num;

            mediaNum = somaNum / cont;

        } while (num != 99);

        System.out.println("\nA soma dos números é: " +somaNum);

        System.out.println("\nA média dos núemros é: " +mediaNum);

    }

}
