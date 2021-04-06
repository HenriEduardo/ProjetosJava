package com.company;

import javax.swing.*;

public class Atividade2 {

    public static void main(String[] args) {

        float valorN;
        float valorV;
        float percetual;
        float valorImposto;
        String input;
        input= JOptionPane.showInputDialog("Digite o valor da venal");
        valorV=Float.parseFloat(input);
        valorN= Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da transação"));
        percetual= Float.parseFloat(JOptionPane.showInputDialog("Digite o valor percentual"));
        if(valorV>=valorN){
            //valor do imposto = maior valor * percentual / 100.
            valorImposto= valorV*percetual/100;
        }else{
            valorImposto= valorN*percetual/100;
        }
        JOptionPane.showMessageDialog(null, "O VALOR A SER PAGO É "+valorImposto);

    }

}