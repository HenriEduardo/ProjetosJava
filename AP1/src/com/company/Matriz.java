package com.company;

import java.util.Random;

public class Matriz {

    int tamanhoMatriz = 10000;
    int[][] matriz_normal = new int[tamanhoMatriz][tamanhoMatriz];
    int[][] numeroASerEncontrado = {{1, 1}, {1, 0}};
    int igual = 0;

    long tempoInicio;

    public void inserirMatriz() {

        tempoInicio = System.currentTimeMillis();

        Random gera = new Random(); //Pra gerar números aleatórios

        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int b = 0; b < tamanhoMatriz; b++) {
                matriz_normal[i][b] = gera.nextInt(2);//Vai gerar números inteiros aleatórios até 100
            }
        }

    }

    public void mostrarMatriz() {

        System.out.println("\nMatriz gearda: \n");
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int b = 0; b < tamanhoMatriz; b++) {
                System.out.print(" " +matriz_normal[i][b]);
            }
            System.out.println(" ");
        }

    }

    public void procurarMatriz() {
        for (int i = 0; i < matriz_normal.length-2; i++) { //coloquei menos 2 para ele não ultrapassar a matriz
            for (int j = 0; j < matriz_normal[i].length-2; j++) { // mesma coisa vale
                if ((matriz_normal[i][j] == numeroASerEncontrado[0][0])
                        && (matriz_normal[i][j + 1] == numeroASerEncontrado[0][1])
                        && (matriz_normal[i + 1][j] == numeroASerEncontrado[0][0])
                        && (matriz_normal[i + 1][j + 1] == numeroASerEncontrado[1][1])
                        && (matriz_normal[i + 2][j] == numeroASerEncontrado[0][0])
                        && (matriz_normal[i + 2][j + 1] == numeroASerEncontrado[1][1])) {
                    igual++;
                }
            }
        }
        if (igual > 0) {
            System.out.println("\nExiste padrão!");
        } else {
            System.out.println("\nNão existe padrão!");
        }

        System.out.println("Tempo Total em milíssegundos: "+(System.currentTimeMillis()-tempoInicio));

    }

}
