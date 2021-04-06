package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2Arrays {

    float[] notaAluno = new float[5];
    int i;
    float media;
    float contador = 0;

    public void notas(){

        for (i = 0; i<notaAluno.length; i++){
            Scanner lerNota = new Scanner(System.in);
            System.out.println("Digite a nota do aluno " +(i+1)+ ": ");
            notaAluno[i] = lerNota.nextFloat();
        }

    }

    public void mostrarNotas(){

        for(int i = 0; i<notaAluno.length; i++) {
            notaAluno[i]=-notaAluno[i];
        }

        Arrays.sort(notaAluno);

        for(int i=0;i<notaAluno.length;i++) {
            notaAluno[i]=-notaAluno[i];
        }

        System.out.println("As notas em ordem decrescente fica: ");

        for (i = 0; i<notaAluno.length; i++){
            System.out.println(notaAluno[i]);
            contador = contador + notaAluno[i];
        }

        media = contador / notaAluno.length;
        System.out.println("\nA média aritmética dos alunos é: " +media);

    }

}
