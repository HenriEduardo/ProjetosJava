import meuPacote.System;

import java.util.Scanner;

public class ContaCorrente{


    public String agencia;
    public int numero;
    public static int ultimaConta=1;
    public double saldo;
    public double limite;
    public Cliente titular;


    public void lerDados(){
        Scanner tc = new Scanner(System.in);
        System.out.println("informe a agencia: ");
        this.agencia = tc.next();
        this.numero = ultimaConta;
        this.saldo=0;
        this.titular = new Cliente();
        this.titular.ler();
        ultimaConta++;
        definirLimite();

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

    public boolean transferencia(double valor, ContaCorrente destino){
        if(saque(valor)){
            destino.deposito(valor);
        }else{
            return false;
        }
        return false;
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

    public void getSaldo(){
        System.out.println("-------------------------");
        System.out.println("cliente: "+this.titular.nome);
        System.out.println("agencia: "+this.agencia);
        System.out.println("saldo: "+this.saldo);
        System.out.println("limite: "+this.limite);
        System.out.println("Valor disponivel para saque: "+(this.limite+this.saldo));
    }

}


