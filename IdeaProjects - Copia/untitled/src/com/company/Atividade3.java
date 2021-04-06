package atividades.company;

import javax.swing.*;

public class Atividade3 {

    public static void main(String[] args) {

        String nota1;
        nota1 = JOptionPane.showInputDialog("Digite a nota da prova 1: ");

        String nota2;
        nota2 = JOptionPane.showInputDialog("Digite a nota da prova 2: ");

        String nota3;
        nota3 = JOptionPane.showInputDialog("Digite a nota do trabalho: ");

        float nota_1 = Integer.parseInt(nota1);
        System.out.println("A nota da prova 1 é: " + nota_1);

        float nota_2 = Integer.parseInt(nota2);
        System.out.println("A nota da prova 2 é: " + nota_2);

        float nota_3 = Integer.parseInt(nota3);
        System.out.println("A nota do trabalho é: " + nota_3);

        float media;
        media = (nota_1 + nota_2 + nota_3) / 3;
        System.out.println("A média final do aluno é: " + media);

        if (media < 6) {
            System.out.println("Aluno reprovado!!");
        }
        else {
            System.out.println("Aluno Aprovado!!");
        }

    }

}
