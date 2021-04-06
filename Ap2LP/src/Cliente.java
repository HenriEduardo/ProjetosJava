import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import meuPacote.ValidaCPF;

public class Cliente{

    String cpf;
    String nome;
    int idade;
    String data_nascimento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }



    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    public void ler(){
        Scanner tc = new Scanner(System.in);
        System.out.print("\ndigite cpf");
        cpf = tc.next();

        System.out.printf("Resultado: ");

        if (ValidaCPF.isCPF(cpf) == true) {
            System.out.printf("%s\n", ValidaCPF.imprimeCPF(cpf));
        }else{
            System.out.print("Erro, CPF invalido !!!\n");
        }



        System.out.print("\ndigite nome");
        this.nome=tc.next();

        System.out.println("\ndigite sua idade");
        this.idade=tc.nextInt();

        System.out.println("\ndigite sua data de nascimento");
        this.data_nascimento=tc.next();


    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", data_nascimento='" + data_nascimento + '\'' +
                '}';
    }

}
