package com.company;

import java.util.Arrays;
import java.util.Random;

public class Ex3Arrays {

    String [] meses = new String[12];


    public void mes (){

        meses [0] = "Janeiro";
        meses [1] = "Fevereiro";
        meses [2] = "Março";
        meses [3] = "Abril";
        meses [4] = "Maio";
        meses [5] = "Junho";
        meses [6] = "Julho";
        meses [7] = "Agosto";
        meses [8] = "Setemebro";
        meses [9] = "Outubro";
        meses [10] = "Novembro";
        meses [11] = "Dezembro";

    }

    public void random (){

        Random random = new Random();

        int numero = random.nextInt(11);

        System.out.println("O número rândomico foi: " +numero);

        System.out.println("O mês selecionado é: " +meses[numero]);

    }

}
