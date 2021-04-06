package com.company;

import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String frase;
        System.out.print("Digite uma frase: ");
        frase = leitor.nextLine();

        frase = frase.toLowerCase();

        Boolean improprio = frase.contains("sexo");
        Boolean improprio2 = frase.contains("sexual");


        if( improprio2 == true || improprio == true){
            System.out.println("conteudo impróprio. ");
        }else{
            System.out.println("conteudo liberado ");
        }

    }

}
