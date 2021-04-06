import meuPacote.ValidaCPF;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        ValidaCPF pf = new ValidaCPF();
        Cliente cpf = new Cliente();
        conta.agencia ="0798";
        conta.numero = 2;

        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        //ContaCorrente c3 = new ContaCorrente();
        c1.lerDados();
        c2.lerDados();
        //c3.lerDados();

        Scanner lerOperacoes = new Scanner(System.in);
        System.out.println("Digite o valor da transferencia: ");
        double ops = lerOperacoes.nextDouble();

        if(!c1.deposito(ops)){
            System.out.println("nao foi possivel");
        }
        if(!c1.saque(ops)){
            System.out.println("nao foi possivel");
        }

        if(c1.transferencia(ops, c2)){
            System.out.println("transferencia realizada");
        }

        c1.getSaldo();
        c2.getSaldo();
        //c3.getSaldo();
    }
}
