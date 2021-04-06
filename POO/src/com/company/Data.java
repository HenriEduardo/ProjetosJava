package com.company;

import java.util.*;

public class Data {

    public void data() {

        int dia = 0;
        int mes = 0;
        int ano = 0;

        Scanner ler_dia = new Scanner(System.in);
        System.out.println("Digite o dia: ");
        dia = ler_dia.nextInt();

        Scanner ler_mes = new Scanner(System.in);
        System.out.println("Digite o mês: ");
        mes = ler_mes.nextInt();

        Scanner ler_ano = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        ano = ler_ano.nextInt();

        if ((dia > 1 && dia < 31) && (mes > 1 && mes < 12) && (ano < 2020)){
            System.out.println( mes + "/" + dia + "/" + ano);
        }

        else{
            System.out.println("null");
        }

    }

}
