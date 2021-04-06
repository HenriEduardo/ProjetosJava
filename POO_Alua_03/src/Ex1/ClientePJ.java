package Ex1;

import java.util.Scanner;

public class ClientePJ extends Cliente{

    String CNPJ;
    String inscricaoUF;
    String inscricaoLocal;

    @Override
    public String getDoc() {
        return CNPJ;
    }

    @Override
    public String cadastrar() {
        super.cadastrar();
        Scanner ler = new Scanner(System.in);
        CNPJ = ler.next();
        return CNPJ;
    }


}
