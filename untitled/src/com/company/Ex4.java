package com.company;

import java.util.Scanner;

public class Ex4 {

    int num;
    int cont = 0;
    int somaNum = 0;
    int mediaNum = 0;

    void multiplosDeTres() {

        System.out.println("\nErcício 4");

        do {
            Scanner lerNum = new Scanner(System.in);
            System.out.println("\nDigite um número: ");
            num = lerNum.nextInt();

            if (num % 3 == 0 && num != 0) {
                cont++;

                somaNum = somaNum + num;

                mediaNum = somaNum / cont;
            }
            else{
                System.out.println("Não é múltiplo de três!");
            }

        } while (num != 0);

        System.out.println("\nA soma dos números é: " +somaNum);

        System.out.println("\nA média dos núemros é: " +mediaNum);

    }

}
