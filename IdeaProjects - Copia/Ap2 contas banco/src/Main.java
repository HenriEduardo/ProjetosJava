
//Usando os conhecimentos de orientação objetos e da linguagem Java. Construa uma classe para modelar uma conta corrente em um banco. Eis algumas regras:
//Cada Conta corrente possui, agência, número, saldo e um Titular da conta.
//O número da conta deve ser único.
//Não é possível criar uma conta sem um CPF válido.
//Não é possível ter mais de uma conta com o mesmo CPF.
//Cada titular possui, CPF, NOME, IDADE, DATA DE NASCIMENTO
//Pessoas com mais de 60 anos possuem um limite de 1000 reais.
//Menores de 18 o limite é de 100 reais
//Outros correntistas possuem limite de 300 reais.
//Efetuar operações de saque, depósito, transferência de valores, saldos e extrato que mostra o saldo adicionado do limite.
//Só é possível criar contas para maiores de 16 anos.

//Crie uma classe de teste para efetuar operações entre contas.

public class Main
 {

        private static int confirmar;

        public static void main(String[] args)
        {

            ContaCorrente Contas = new ContaCorrente();

            Contas.LerDados();
            Contas.SaqueDepositoTransferencia();

            Contas.LerDados();
            Contas.SaqueDepositoTransferencia();

            Contas.LerDados();
            Contas.SaqueDepositoTransferencia();

        }

 }




