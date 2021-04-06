package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Item> itens = new ArrayList<>();

    public static void main(String[] args) {

        Frase02 a = new Frase02();
        a.frase02();

        Conversao b = new Conversao();
        b.dolar();

        Conversao c = new Conversao();
        c.bitcoin();

        Conversao d = new Conversao();
        d.reais();

        Conversao e = new Conversao();
        e.reaisBitcoin();

// --------------------------------------------------------------------------------------------------------------------

        String item = "";
        int quantidade;
        float preco = 0;

        int i;
        int opcao;
        do{
            System.out.println("1 para inserir item, 2 para remover item, 3 para listar os itens");
            Scanner leitor = new Scanner(System.in);
            opcao = leitor.nextInt();
            switch (opcao){
                case 1: {
                    System.out.println("Qual o nome do produto que deseja adicionar? ");
                    item = leitor.next();

                    System.out.println("Qual o valor do produto? ");
                    preco = leitor.nextFloat();

                    System.out.println("Qual a quantidade do produto? ");
                    quantidade = leitor.nextInt();

                    add (item, preco, quantidade);
                    break;
                }

                case 2: {
                    System.out.println("Qual item deseja remover? ");
                    item = leitor.next();
                    removerItem(item);
                }

                case 3:{
                    listarItens();
                }

                case 4:{
                    listarTotal();
                }

            }

        }while (opcao != 5);

    }

    public static void add(String item, float preco, int quantidade){

        itens.add(new Item(item, preco, quantidade));

    }

    public static void removerItem(String nome) {

        for (Item removerItem : itens) {
            if (removerItem.buscaItem().equals(removerItem)) {
                itens.remove(removerItem);
                break;

            }

        }

    }

    public static void listarItens() {
        for (Item listaritem : itens) {
            System.out.println("Produto: " + listaritem.buscaItem());
            System.out.println("Valor: " + listaritem.preco());
            System.out.println("Quantidade: " + listaritem.quantidade());
        }
    }

    public static void listarTotal() {
        float total = 0;
        for (Item listarTotal : itens) {
            total += listarTotal.getTotal();
        }
        System.out.println("O valor total dos itens é: " + total);
    }

}
