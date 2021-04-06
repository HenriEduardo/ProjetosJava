package com.company;

import java.util.Scanner;

public class Frase02 {

    public void frase02(){

        String frase;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        frase = leitor.nextLine();

        String contains;
        System.out.println("Digite a palavra que você quer saber se tem na frase:");
        contains = leitor.nextLine();

        if (contains.length() <= 5){
            if (frase.contains(contains)) {
                System.out.println("Palavra existe na frase");
            } else {
                System.out.println("Palavra não existe na frase");
            }
        }else{
            System.out.println("Palavra com mais de 5 caracteres");
        }

    }

}
