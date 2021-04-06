package com.company;

import javafx.scene.chart.ValueAxis;

import java.util.Scanner;

public class Conversao {

        public void dolar(){

            Scanner leitor = new Scanner(System.in);
            float valorEmReais;
            System.out.println("Digite o valor em REAIS para converter em DÓLAR: ");
            valorEmReais = leitor.nextFloat();

            float valorDoDolar;
            System.out.println("Digite o valor do DÓLAR em comparação com o REAL: ");
            valorDoDolar = leitor.nextFloat();

            float resultConversor;
            resultConversor = valorEmReais/valorDoDolar;
            System.out.println("O valor da conversão de REAIS para DÓLAR é: " +resultConversor);

        }

        public void bitcoin(){

            Scanner leitor = new Scanner(System.in);
            float valorEmReais ;
            System.out.println("Digite o valor em REAIS para converter em BITCOIN: ");
            valorEmReais  = leitor.nextFloat();

            float valorDoBitcoin;
            System.out.println("Digite o valor do BITCOIN em comparação com o REAL: ");
            valorDoBitcoin = leitor.nextFloat();

            float resultConversor;
            resultConversor = valorEmReais/valorDoBitcoin;
            System.out.println("O valor da conversão de REAIS para BITCOIN é: " +resultConversor);

        }

        public void reais(){

            Scanner leitor = new Scanner(System.in);
            float quantidadeDeDolares;
            System.out.println("Digite o valor em DÓLAR para converter em REAIS: ");
            quantidadeDeDolares = leitor.nextFloat();

            float valorDoDolar;
            System.out.println("Digite o valor do DÓLAR em comparação com o REAL: ");
            valorDoDolar = leitor.nextFloat();

            float resultConversor;
            resultConversor = quantidadeDeDolares*valorDoDolar;
            System.out.println("O valor da conversão de DÓLAR para REAIS é: " +resultConversor);

        }

        public void reaisBitcoin(){

            Scanner leitor = new Scanner(System.in);
            float quantidadeDeDolares;
            System.out.println("Digite o valor em DÓLAR para converter em REAIS: ");
            quantidadeDeDolares = leitor.nextFloat();

            float valorDoDolar;
            System.out.println("Digite o valor do REAL em comparação com o DÓLAR: ");
            valorDoDolar = leitor.nextFloat();

            float resultConversor;
            resultConversor = quantidadeDeDolares*valorDoDolar;
            System.out.println("O valor da conversão de DÓLAR para REAIS é: " +resultConversor);

            float valorDoBitcoin;
            System.out.println("Digite o valor do BITCOIN em comparação com o REAL: ");
            valorDoBitcoin = leitor.nextFloat();

            float resultBitcoin;
            resultBitcoin = resultConversor/valorDoBitcoin;
            System.out.println("O valor em BITCOIN é: " +resultBitcoin);

        }

}
