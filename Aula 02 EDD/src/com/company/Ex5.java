package com.company;

public class Ex5 {

    int armazena[] = new int[50], valor = 101, i;
    String aux;

    public void ler() {

        for (i = 0; i < 50; i++) {
            armazena[i] = valor;
            valor++;
        }

    }

    public void mostrar() {
        System.out.println("Exibindo valores: \n");
        for (i = 0; i < 50; i++){
            aux = "";
            if (i < 10)
                aux = "0";
            System.out.println("Valor " + aux + i + ": " + armazena[i]);
        }
    }

}
