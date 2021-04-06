public class Main {
    public static void main(String[] args) {

        Leitura leitura = new Leitura();

        String linha = leitura.lerString();
        float real = leitura.lerFloat();
        double duplo = leitura.lerDouble();
        int inteiro = leitura.lerInt();
        char caractere = leitura.lerChar();
        String email = leitura.lerEmail();
        String telefone = leitura.lerTelefone();
        String data = leitura.lerData();
        String dataC = leitura.convertData();
        String dado = leitura.verificaDado();

        System.out.println("\n\nResultados:\n");
        System.out.println("String: " + linha);
        System.out.println("Float: " + real);
        System.out.println("Double: " + duplo);
        System.out.println("Inteiro: " + inteiro);
        System.out.println("Char: " + caractere);
        System.out.println("\n");
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data: " + data);
        System.out.println("Data formatada: " + dataC);
        System.out.println("Número: " + dado);

    }
}