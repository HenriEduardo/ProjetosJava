package com.company;

import java.util.Scanner;

public class Ex1 {

    float[] nota = new float[5];
    String[] nome = new String[5];
    float media, contNotas = 0;
    int i;

    public void obterNomeENota() {

        for (int i = 0; i < nome.length; i++) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o nome do aluno: " +nome[i]);
            nome[i] = ler.next();
            System.out.println("Digite a nota do aluno: " +nota[i]);
            nota[i] = ler.nextFloat();
            contNotas = contNotas + nota[i];
        }

    }

    public void mediaNotas() {

        media = contNotas / 5;
        System.out.println("A média das notas é: " +media);

    }

    public void mostrarValores() {

        System.out.println("\nNotas acima da média: ");
        for (i = 0; i <nota.length; i++){
            if (nota[i] > media){
                System.out.println("Aluno " +nome[i]+ " teve nota " +nota[i]);
            }
        }

    }

}
