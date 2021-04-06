package com.company;

import java.util.Scanner;

public class Hora {

    int hora;
    int minutos;
    int segundos;

    public void hora() {

        Scanner lerHora = new Scanner(System.in);
        System.out.println("Digite a hora: ");
        hora = lerHora.nextInt();

        Scanner lerMinutos = new Scanner(System.in);
        System.out.println("Digite os minutos: ");
        minutos = lerMinutos.nextInt();

        Scanner lerSegundos = new Scanner(System.in);
        System.out.println("Digite os segundos: ");
        segundos = lerSegundos.nextInt();

    }

    public void mostrarHora(){

        if ((segundos > 0 && segundos < 60) && (minutos > 0 && minutos < 60) && (hora > 0 && hora < 24)){
            System.out.println("A hora digitada é: " +hora+ ":" +minutos+ ":" +segundos);
        }else{
            System.out.println("Hora inválida");
        }

    }

}
