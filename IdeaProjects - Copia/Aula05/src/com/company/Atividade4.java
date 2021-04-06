package com.company;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        String frase;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a frase: ");
        frase = leitor.nextLine();

        for (int i = frase.length()-1; i >= 0; i--){
            if (frase.charAt(i) != ' ');{
                System.out.print(frase.charAt(i));
            }
        }

    }

}
