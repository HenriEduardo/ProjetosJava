package com.company;

public class Atividade1 {

    public static void main(String[] args) {

        int soma = 0;
        for (int i=0; i<3; i++){
            int sorteio = (int) (Math.random() *7);
            System.out.println(sorteio);
            soma = soma + sorteio;
        }
        System.out.println(soma);
    }
}
