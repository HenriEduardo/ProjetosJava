package atividades.company;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner nome_scanner = new Scanner(System.in);
        char nome;
        System.out.print("Digite o nome do produto: ");
        nome = nome_scanner.next().charAt(0);

        Scanner valor_scanner = new Scanner(System.in);
        float valor;
        System.out.print("Digite o valor do produto: ");
        valor = valor_scanner.nextFloat();

        if ((valor >= 50) && (valor < 200)) {
            float desconto_A = (valor * 5) / 100;
            System.out.println("O valor do desconto é: " +desconto_A);
            float final_A = valor - desconto_A;
            System.out.print("O preço final do produto " +nome);
            System.out.println(" é: " +final_A);
        }

        if ((valor >= 200) && (valor < 500)) {
            float desconto_B = (valor * 6) / 100;
            System.out.println("O valor do desconto é: " +desconto_B);
            float final_B = valor - desconto_B;
            System.out.print("O preço final do produto " +nome);
            System.out.println(" é: " +final_B);
        }

        if ((valor >= 500) && (valor < 1000)) {
            float desconto_C = (valor * 7) / 100;
            System.out.println("O valor do desconto é: " +desconto_C);
            float final_C = valor - desconto_C;
            System.out.print("O preço final do produto " +nome);
            System.out.println(" é: " +final_C);
        }

        if (valor >= 1000) {
            float desconto_D = (valor * 8) / 100;
            System.out.println("O valor do desconto é: " +desconto_D);
            float final_D = valor - desconto_D;
            System.out.print("O preço final do produto " +nome);
            System.out.println(" é: " +final_D);
        }

    }

}
