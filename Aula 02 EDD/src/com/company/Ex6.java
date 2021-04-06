package com.company;

import java.util.Random;

public class Ex6 {

    Random random = new Random();
    int[] vetNumeros = new int[50];
    int i;

        public void armazenarNumeros() {

            for (i = 0; i < vetNumeros.length; i++){
                vetNumeros[i] = random.nextInt(100);
            }

        }

        public void mostrarDados() {
            for (i = 0; i < vetNumeros.length; i++){
                System.out.println(vetNumeros[i]);
            }
        }


}
