package com.company;

import java.util.Objects;
import java.util.Scanner;

public class ContaCorrente {

    public String agencia;
    public int numero;
    public static int ultimaConta = 1;
    public double saldo;
    public double limite;
    public Cliente titular;
    public int operacao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaCorrente that = (ContaCorrente) o;
        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    public ContaCorrente (int num){

        this.numero = num;

    }

    public ContaCorrente() {

        this.numero = ultimaConta;
        ultimaConta++;
        lerDados();
        mostrar();

    }

    private void lerDados() {

        System.out.println("___________________________");
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a Agência:");
        this.agencia = tc.next();
        System.out.println("Gerando sua conta... ");

        this.saldo = 0;
        this.titular = new Cliente();
        this.titular.ler();
        definirLimite();

    }

    public void escolherOperacao(){

        if (this.titular.idade > 15) {
            Scanner op = new Scanner(System.in);
            System.out.println("Escolha uma operação (1 para saque, 2 para depósito ou 0 para cancelar a ação): ");
            this.operacao = op.nextInt();

            if (operacao == 1) {
                Scanner lerValor = new Scanner(System.in);
                System.out.println("Digite o valor do saque: ");
                double valorSaque = lerValor.nextDouble();
                if (valorSaque <= (saldo + limite)) {
                    System.out.println("Valor de saque é: " + valorSaque);
                    this.saldo -= valorSaque;
                } else {
                    System.out.println("saldo insuficiente");
                }

                getSaldo();

            }

            if (operacao == 2) {
                Scanner lerValor = new Scanner(System.in);
                System.out.println("Digite o valor do depoósito: ");
                double valorDeposito = lerValor.nextDouble();
                if (valorDeposito > 0) {
                    this.saldo += valorDeposito;
                } else {
                    System.out.println("saldo insuficiente");
                }

                getSaldo();

            }

            if (operacao == 0) {

                System.out.println("Operação cancelada");

            }
        }else {
            System.out.println();
        }

    }

    private void definirLimite(){

        if (this.titular.idade > 60) {
            this.limite = 1000.00;
        } else if (this.titular.idade < 18) {
            this.limite = 100.00;
        } else {
            this.limite = 300.00;
        }

    }

    public void mostrar(){

        if (this.titular.idade > 15) {

            System.out.println("___________________________");
            System.out.println("Agência: " + this.agencia);
            System.out.println("Número: " + this.numero);
            System.out.println("Cliente: " + this.titular.toString());
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Limite: " + this.limite);

        }else{
            System.out.println("Não foi possível criar sua conta (não tem idade suficiente)!");
        }

    }

    public boolean deposito(double valor){
        if(valor>0){
            this.saldo+= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean saque(double valor){
        if(valor<=(saldo+limite)){
            this.saldo-=valor;
            return true;
        }else{
            System.out.println("saldo insuficiente");
            return false;
        }
    }

    public boolean transferir(double valor, ContaCorrente destino){

        if (saque(valor)){
            return destino.deposito(valor);
        }else{
            return false;
        }

    }

    public void getSaldo(){

        System.out.println("___________________________");
        System.out.println("Cliente: " + this.titular.nome);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
        System.out.println("Valor disponível para saque: " + (this.limite+this.saldo));

    }

}
