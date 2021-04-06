package com.company;

public class Atividade3 {

    public static void main(String[] args) {

        int sorteio = 0;

        while (sorteio < 5) {
            sorteio = (int) (Math.random()*11);
        }

        System.out.println("A número gerado foi: " +sorteio);
        System.out.print("A senha gerada foi: ");

        for (int i = 0; i<sorteio; i++){
            System.out.print((int) (Math.random()*10));
        }

    }

}
