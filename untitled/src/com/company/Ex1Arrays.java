package com.company;

import java.util.Scanner;

public class Ex1Arrays {

    int i;
    int[] inteirosData = new int[4];

    public void lerDados (){

        for (i = 0; i<inteirosData.length; i++){
            Scanner lerString = new Scanner(System.in);
            System.out.println("\nDigite algum valor: ");
            inteirosData[i] = lerString.nextInt();
        }

    }

    public void mostrarDados (){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("{");

        for (i = 0; i<inteirosData.length; i++){
            stringBuilder.append(inteirosData[i]+",");
        }

        stringBuilder.append("}");

        System.out.println(stringBuilder);

    }

}
