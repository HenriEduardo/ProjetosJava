package com.company;

import java.util.Scanner;

public class Ex13Slide {

    int[] valor = new int[10];
    int calculaValor = 0;

    public void recebeValor() {

        for (int i = 0; i < valor.length; i++){

            Scanner lerValor = new Scanner(System.in);
            System.out.println("Digite o valor na posição: " +(i+1));
            valor[i] = lerValor.nextInt();

        }

    }

    public void calculaValores() {

        for (int i = 0; i < valor.length; i++){

            calculaValor = calculaValor + valor[i];

        }

        System.out.println("A sima total dos dez valores é: " +calculaValor);

    }

    public void mostraValores() {

        for (int i = 0; i < valor.length; i++){
            if (valor[i] > 50){
                System.out.println("O valor na posição " +(i+1)+ " foi maior que 50! O valor foi: " +valor[i]);
            }
        }

    }

}
