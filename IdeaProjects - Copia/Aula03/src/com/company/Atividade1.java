package atividades.company;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner leitor_scanner = new Scanner(System.in);
        System.out.print("Digite o valor: ");

        float valor = leitor_scanner.nextFloat();
        Scanner porcentagem_scanner = new Scanner(System.in);
        System.out.print("Digite a porcentagem de desconto: ");

        float porcentagem = porcentagem_scanner.nextFloat();
        float desconto = valor * porcentagem / 100.0F;

        System.out.println("O valor do desconto é: R$" + desconto);
        float resultado_final = valor - desconto;
        System.out.println("O valor final do produto é: R$" + resultado_final);
    }
}
