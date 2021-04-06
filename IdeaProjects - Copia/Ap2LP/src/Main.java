import meuPacote.ValidaCPF;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();

        c1.lerDados();
        c2.lerDados();

        if (c1.deposito(50)){
            c1.mostrar();
        }else{
            System.out.println("Não foi possível realizar depoósito");
        }
        if (c1.saque(100)){
            c1.mostrar();
        }else{
            System.out.println("Não foi possível realizar saque");
        }
        if (c2.deposito(100)){
            c2.mostrar();
        }else{
            System.out.println("Não foi possível realizar depoósito");
        }
        if (c2.saque(50)){
            c2.mostrar();
        }else{
            System.out.println("Não foi possível realizar saque");
        }

        if (c1.transferencia(50, c2)){
            System.out.println("Transferência realizada");
        }else{
            System.out.println("Não foi possível realizar a tranferência");
        }

        c1.mostrar();
        c2.mostrar();

    }

}
