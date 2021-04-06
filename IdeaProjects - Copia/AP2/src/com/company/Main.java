package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<ContaCorrente> correntistas = new ArrayList<>();

        int opcao;
        do{
            System.out.println("1 para cadastrar contas, 2 para depósito, 3 para saque ou 0 para sair");
            Scanner tc = new Scanner(System.in);
            opcao = tc.nextInt();
            switch (opcao){
                case 1: {
                    ContaCorrente c1 = new ContaCorrente();
                    correntistas.add(c1);
                    break;
                }
                case 2: {
                    System.out.println("depósito");
                    System.out.println("Digite a conta a ser acessada");
                    int number = tc.nextInt();
                    ContaCorrente origem = new ContaCorrente(number);
                    int p = correntistas.indexOf(origem);
                    if (p >= 0) {
                        origem = correntistas.get(p);
                        Scanner lerValor = new Scanner(System.in);
                        System.out.println("Digite o valor do depoósito: ");
                        double valor = lerValor.nextDouble();
                        ContaCorrente teste = new ContaCorrente();
                        if(valor>0){
                            teste.saldo+= valor;
                        }else{
                            System.out.println("Saldo insuficiente");;
                        }
                    } else {
                        System.out.println("Essa conta não existe");
                    }
                    break;
                }
                default: {
                    System.out.println("saiu");
                }
            }
        }while (opcao != 0);




//        int transferir;
//        Scanner scanner_transferencia = new Scanner(System.in);
//        System.out.println("Deseja realizar uma transferência? (1 para sim ou 0 para não)");
//        transferir = scanner_transferencia.nextInt();
//
//        if (transferir == 1) {
//            Scanner tc = new Scanner(System.in);
//            System.out.println("Digite a conta de origem da tranferência: ");
//            int number = tc.nextInt();
//
//            ContaCorrente origem = new ContaCorrente(number);
//            int p = correntistas.indexOf(origem);
//            if (p >= 0) {
//                origem = correntistas.get(p);
//                System.out.println("Digite a conta destino da tranferência: ");
//                int number1 = tc.nextInt();
//
//                ContaCorrente destino = new ContaCorrente(number1);
//                int p2 = correntistas.indexOf(destino);
//                destino = correntistas.get(p2);
//                if (p2 >= 0) {
//                    System.out.printf("Digite o valor");
//                    double trans = tc.nextDouble();
//                    origem.transferir(trans, destino);
//                    System.out.println();
//                } else {
//                    System.out.println("Não há conta!");
//                }
//            } else {
//                System.out.println("Não há correntista!");
//            }
//
//        }else{
//            System.out.println("Operação cancelada");
//        }

//        for (int i = 0; i < correntistas.size(); i++){
//            correntistas.get(i).getSaldo();
//        }

    }

}
