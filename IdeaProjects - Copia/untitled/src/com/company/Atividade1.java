package atividades.company;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {

        Scanner leitor_scanner = new Scanner(System.in); // O objeto System.in é o que faz a leitura do que se escreve no teclado //
        float valor;
        System.out.print("Digite o valor: ");
        valor = leitor_scanner.nextFloat();

        Scanner porcentagem_scanner = new Scanner(System.in); // O objeto System.in é o que faz a leitura do que se escreve no teclado //
        float porcentagem;
        System.out.print("Digite a porcentagem de desconto: ");
        porcentagem = porcentagem_scanner.nextFloat();

        float desconto;
        desconto = (valor * porcentagem) / 100;
        System.out.println("O valor do desconto é: R$" +desconto);

        float resultado_final;
        resultado_final = valor - desconto;
        System.out.println("O valor final do produto é: R$" +resultado_final);

    }

}
