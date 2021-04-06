
package com.company;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        char sexo;
        int idade;
        int contribuição;

        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o sexo (f para feminino ou m para masculino): ");
        sexo = tc.next().charAt(0);

        System.out.print("Digite a idade: ");
        idade = tc.nextInt();

        System.out.print("Digite o tempo de contribuição: ");
        contribuição = tc.nextInt();

        if ((sexo == 'f') && (contribuição < 30) && (idade < 60)) {
            System.out.println("Ainda não pode se aposentar");
            if (contribuição < 30) {
                int falta = 30 - contribuição;
                System.out.println("Faltam ainda " +falta+ " ano(s) para se aposentar por tempo de contribuição!");
            }
            if (idade < 60) {
                int falta_idade = 60 - idade;
                System.out.println("Faltam ainda " + falta_idade + " ano(s) para se aposentar por idade");
            }
        }

        if ((sexo == 'm') && (contribuição < 35) && (idade < 65)) {
            System.out.println("Ainda não pode se aposentar");
            if (contribuição < 35) {
                int falta_contribuição = 35 - contribuição;
                System.out.println("Faltam ainda " +falta_contribuição+ " ano(s) para se aposentar por tempo de contribuição!" );
            }
            if (idade < 65) {
                int falta_idade = 65 - idade;
                System.out.println("Faltam ainda " +falta_idade+ " ano(s) para se aposentar por idade!");
            }
        }

        if ((sexo == 'f') && (contribuição >= 30)) {
            System.out.println("você já tem o direito da aposentadoria pelo fator tempo de contribuição!");
        }
        if ((sexo == 'f') && (idade >= 60)) {
            System.out.println("você já tem o direito da aposentadoria pelo fator idade!");
        }
        if ((sexo == 'm') && (contribuição >= 35)) {
            System.out.println("você já tem o direito da aposentadoria pelo fator tempo de contribuição!");
        }
        if ((sexo == 'm') && (idade >= 65)) {
            System.out.println("você já tem o direito da aposentadoria pelo fator idade!");
        }
    }
}

