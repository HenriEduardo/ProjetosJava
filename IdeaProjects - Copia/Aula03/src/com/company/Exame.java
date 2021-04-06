package com.company;

public class Exame {

    public static void main(String[] args) {

        int m=0; int n=2;

        do {
            m=++m-n;
            n--;
        }while (n>0);
        System.out.println(m);

    }

}
