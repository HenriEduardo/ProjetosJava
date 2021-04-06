package com.company;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        float valor;

        do {

            Scanner leitor = new Scanner(System.in);
            System.out.print("Digite o valor do produto a ser reajustado (0 encerra o programa): ");
            valor = leitor.nextFloat();

            if (valor != 0) {
                float reajuste;
                reajuste = valor + (valor * 12 / 100);
                System.out.println("O valor reajustado é: " +Math.round(reajuste));
            }

        } while (valor != 0);

    }

}
