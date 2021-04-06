package com.company;

import java.util.Scanner;

public class Ex1Slide {

    float[] temperatura = new float[7];
    String[] diasSemana = new String[7];
    float media;
    float contTemperaturas = 0;
    float maior;

    public void obterValorTemperaturas() {

        for (int i = 0; i < diasSemana.length; i++) {
            Scanner lerValor = new Scanner(System.in);
            System.out.println("Digite a temperatura dia dia " +(i+1)+ ": ");
            temperatura[i] = lerValor.nextFloat();
            contTemperaturas = contTemperaturas + temperatura[i];
        }

    }

    public void mediaTemperaturas() {

        media = contTemperaturas / 7;
        System.out.println("A média das temperaturas é: " +media);

    }

    public void mostrarValores() {

        for (int i = 0; i < temperatura.length; i++){
            if (temperatura[i] > media){
                System.out.println("O dia " +(i+1)+ " registrou temperatura acima da média! A temperatura " +
                        "neste dia foi de " +temperatura[i]+ " graus celsius!");
            }
        }

    }

}
