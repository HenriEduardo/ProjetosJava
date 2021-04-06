package com.company;

import java.util.Scanner;

public class Ex4 {

    int[] numeros = new int[10];
    int i;

    public void lerNumeros() {

        Scanner ler = new Scanner(System.in);

        for (i = 0; i < numeros.length; i++){
            System.out.println("Digite o número da posição " +(i+1)+ ": ");
            numeros[i] = ler.nextInt();
        }

    }

    public void retornoNumeros() {

        System.out.println("\nNúmeros na ordem inversa: ");
        for(i = numeros.length-1; i >= 0; i--){
            System.out.println(numeros[i]);
        }

    }

}
