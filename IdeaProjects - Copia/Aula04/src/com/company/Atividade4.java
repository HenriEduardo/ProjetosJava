package com.company;

public class Atividade4 {

        public static void main(String[] args) {

            ehPalindro("ramon");
            ehPalindro("socos");
            ehPalindro("omississimo");
            ehPalindro("ovo");


        }



        static void ehPalindro(String palavra){
            for(int i=0; i<palavra.length(); i++) {
                if(palavra.charAt(i) != palavra.charAt((palavra.length() -1) - i)) {
                    System.out.println("Não é um palindromo");
                    break;
                }
            }
            System.out.println("É um palindromo");
        }


}
