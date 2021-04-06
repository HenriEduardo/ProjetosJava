package Ex1;

import java.util.Scanner;

public class ClientePF extends Cliente {

    String CPF;

    @Override
    public String getDoc() {
        return CPF;
    }

    @Override
    public String cadastrar() {
        super.cadastrar();
        Scanner ler = new Scanner(System.in);
        CPF = ler.next();
        return CPF;
    }
}
