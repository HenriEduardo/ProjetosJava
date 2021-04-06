package com.company;

import java.util.Scanner;

public class Item {

    public String item;
    public float preco;
    public int quantidade;
//    public String removerItem;

    public Item(String item, float preco, int quantidade) {
        this.item = item;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getTotal(){
        return preco * quantidade;

    }
    public String buscaItem() {
        return item;
    }

    public int quantidade() {
        return quantidade;
    }


    public float preco() {
        return preco;
    }

}
