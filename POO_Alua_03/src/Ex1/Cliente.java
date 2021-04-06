package Ex1;

import java.util.Scanner;

public abstract class Cliente {

    String nome;
    String telefone;
    String endereco;
    Double limiteDeCredito;

    public abstract String getDoc();

    public abstract String cadastrar();{
        Scanner ler = new Scanner(System.in);
        nome = ler.next();
        telefone = ler.next();
        endereco = ler.next();
        limiteDeCredito = ler.nextDouble();
        return "add";
    }

    public abstract String remover();

    public abstract String listar();

    public abstract String atualizar();

    public abstract String liberarCredito();

    public abstract String buscarPedidos();

}
