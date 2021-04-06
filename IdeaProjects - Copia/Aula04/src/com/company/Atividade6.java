package com.company;

import java.util.Random;

public class Atividade6 {
    public static void main(String[] args) {
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro","Outubro", "Novembro", "Dezembro" };

        Random sorteio = new Random();
        int a= sorteio.nextInt(11);
        System.out.println(meses[a]);
        //System.out.println(meses[sorteio.nextInt(11)]);
    }
}
