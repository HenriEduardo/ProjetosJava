package com.company;

import java.util.Scanner;


public class Ex2 {

    float[] notas;
    float media;
    float contNotas = 0;
    int qtdDeNotas, i;

    public void recebeNotas() {

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor ");
        qtdDeNotas = ler.nextInt();
        notas = new float[qtdDeNotas];

        for(i = 0; i<qtdDeNotas; i++)
        {
            System.out.println("Informe a " +(i+1)+ "ª nota: ");
            notas[i] = ler.nextFloat();
            contNotas = contNotas + notas[i];
        }

    }

    public void calculaMedia() {

        media = contNotas / qtdDeNotas;
        System.out.println("A média de nota é: " +media);

    }

    public void mostrarValores() {

        System.out.println("\nNotas acima da média: ");
        for (i = 0; i <qtdDeNotas; i++){
            if (notas[i] > media){
                System.out.println(notas[i]);
            }
        }

        System.out.println("\nNotas abaixo da média: ");
        for (i = 0; i <qtdDeNotas; i++){
            if (notas[i] <= media){
                System.out.println(notas[i]);
            }
        }

    }

}
