package com.company;

import java.util.Objects;
import java.util.Scanner;
import com.company.ValidaCPF;

public class Cliente {

    String cpf;
    String nome;
    int idade;
    String dataNascimento;

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

        do {
            System.out.println("Digite o CPF: ");
            this.cpf = tc.next();
        }while (ValidaCPF.isCPF(cpf) == false);

        System.out.println("Digite o nome: ");
        this.nome = tc.next();

        System.out.println("Digite a idade: ");
        this.idade = tc.nextInt();

        System.out.println("Digite a data de nascimento: ");
        this.dataNascimento = tc.next();

    }
//
//    @Override
//    public String toString() {
//        return "cpf='" + cpf + '\'' +
//                ", nome='" + nome + '\'' +
//                ", idade=" + idade +
//                ", dataNascimento='" + dataNascimento + '\'' ;
//    }

}
