package com.company;

import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {

        int n;
        int numero;
        int tabuada;

        Scanner numero_scanner = new Scanner(System.in);
        System.out.print("Digite qual tabuada você deseja ver na sua tela: ");
        numero = numero_scanner.nextInt();

        for (n = 1; n <= 10; ++n) {

            tabuada = numero * n;
            System.out.println(+n+ "x" +numero+ "=" +tabuada);

        }

    }

}
