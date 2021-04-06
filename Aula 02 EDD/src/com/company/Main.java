package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ex1 ex1 = new Ex1();
        ex1.obterNomeENota();
        ex1.mediaNotas();
        ex1.mostrarValores();

        Ex2 ex2 = new Ex2();
        ex2.recebeNotas();
        ex2.calculaMedia();
        ex2.mostrarValores();

        Ex4 ex4 = new Ex4();
        ex4.lerNumeros();
        ex4.retornoNumeros();

        Ex5 ex5 = new Ex5();
        ex5.ler();
        ex5.mostrar();

        Ex6 ex6 = new Ex6();
        ex6.armazenarNumeros();
        ex6.mostrarDados();

    }
}
