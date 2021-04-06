import java.util.ArrayList;
import java.util.Scanner;


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

public class ContaCorrente
 {

     public String Nome;
     public String DataDeNascimento;
     public String CPF = null;
     public String CpfRepetiçao1 = "1";
     public String CpfRepetiçao2 = "2";
     public String CpfRepetiçao3 = "3";
     public int Agencia;
     public int NomeParaSaque;
     public int Idade;
     public int Saldo;
     public int Valor;
     public int Valor1;
     public int Valor2;
     public int Valor3;
     public int limiteDeSaque;
     public int n = 1;
     public int m = 0;
     public static int UltimaConta=1;
     public static int VerificadorDeSaque = 3;
     public static int VerificadorDeDeposito = 3;
     public static int VerificadorDeTransferencia = 3;
     public ArrayList<String> Conta1 = new ArrayList<>(7);
     public ArrayList<String> Conta2 = new ArrayList<>(7);
     public ArrayList<String> Conta3 = new ArrayList<>(7);

     public void LerDados()
     {

         Scanner NomeCliente = new Scanner(System.in);
         System.out.println("digite o nome do cliente");
         this.Nome = NomeCliente.nextLine();

         if ( m == 0) {

             this.Conta1.add(Nome);
             this.Conta1.add(String.valueOf(UltimaConta));

         }

         if ( m == 1){

             this.Conta2.add(Nome);
             this.Conta2.add(String.valueOf(UltimaConta));

         }

         if ( m == 2){

             this.Conta3.add(Nome);
             this.Conta3.add(String.valueOf(UltimaConta));

         }

         UltimaConta++;

         Scanner IdadeDoCliente = new Scanner(System.in);
         System.out.println("digite a idade do cliente");
         this.Idade = IdadeDoCliente.nextInt();

         if (Idade < 16) {

             while (n != 0) {

                 System.out.println("Idade Invalida!!");
                 System.out.println("titular tem que ter no minimo 16 anos");
                 Scanner VerificarIdadeValida = new Scanner(System.in);
                 System.out.println("digite Uma idade valida :");
                 Idade = VerificarIdadeValida.nextInt();

                 if (Idade >= 16) {

                     n = 0;

                 }

             }

         }

         if (Idade >= 16 && Idade < 18) {

             this.limiteDeSaque = 100;

             if ( m == 0) {

                 this.Conta1.add(String.valueOf(limiteDeSaque));
                 Saldo = Valor1 + 0;
                 this.Conta1.add(String.valueOf(Saldo));

             }

             if ( m == 1) {

                 this.Conta2.add(String.valueOf(limiteDeSaque));
                 Saldo = Valor2 + 0;
                 this.Conta2.add(String.valueOf(Saldo));

             }

             if ( m == 2) {

                 this.Conta3.add(String.valueOf(limiteDeSaque));
                 Saldo = Valor3 + 0;
                 this.Conta3.add(String.valueOf(Saldo));

             }

         }

         if (Idade >= 18 && Idade < 60) {

             this.limiteDeSaque = 300;
             this.Saldo = 0;

             if ( m == 0) {

                 this.Conta1.add(String.valueOf(limiteDeSaque));
                 Saldo = Valor1 + 0;
                 this.Conta1.add(String.valueOf(Saldo));

             }

             if ( m == 1) {

                 this.Conta2.add(String.valueOf(limiteDeSaque));
                 Saldo = Valor2 + 0;
                 this.Conta2.add(String.valueOf(Saldo));

             }

             if ( m == 2) {

                 this.Conta3.add(String.valueOf(limiteDeSaque));
                 Saldo = Valor3 + 0;
                 this.Conta3.add(String.valueOf(Saldo));

             }

         }

         if (Idade >= 60) {

             this.limiteDeSaque = 1000;
             this.Saldo = 0;

             if ( m == 0) {

                 this.Conta1.add(String.valueOf(limiteDeSaque));
                 Saldo = Valor1 + 0;
                 this.Conta1.add(String.valueOf(Saldo));

             }

             if ( m == 1) {

                 this.Conta2.add(String.valueOf(limiteDeSaque));
                 Saldo = Valor2 + 0;
                 this.Conta2.add(String.valueOf(Saldo));

             }

             if ( m == 2) {

                 this.Conta3.add(String.valueOf(limiteDeSaque));
                 Saldo = Valor3 + 0;
                 this.Conta3.add(String.valueOf(Saldo));

             }

         }

         if ( m == 0) {

             this.Conta1.add(String.valueOf(Idade));

         }

         if ( m == 1) {

             this.Conta2.add(String.valueOf(Idade));

         }

         if ( m == 2) {

             this.Conta3.add(String.valueOf(Idade));

         }

         int z = 1;

         while (z != 0) {

             Scanner ler = new Scanner(System.in);
             System.out.printf("Informe um CPF: ");
             CPF = ler.next();

             if ((ValidaCPF.isCPF(CPF) == true)){

                 z = 0;

             }

             if ((ValidaCPF.isCPF(CPF) == false )){

                 System.out.printf("Erro, CPF invalido !!!\n");

             }

             if ( m == 0) {

                this.Conta1.add( ValidaCPF.imprimeCPF(CPF));

             }

             CpfRepetiçao1 = Conta1.get(5);

             if ( m == 1) {

                this.Conta2.add( ValidaCPF.imprimeCPF(CPF));
                CpfRepetiçao2 = Conta2.get(5);

             }

             if (CpfRepetiçao2.equals(CpfRepetiçao1)) {

                 z = 1;
                 System.out.printf("Erro, CPF ja foi utilizado !!!\n");

             }

             if ( m == 2) {

                this.Conta3.add( ValidaCPF.imprimeCPF(CPF));
                CpfRepetiçao3 = Conta3.get(5);

             }

             if (CpfRepetiçao3.equals(CpfRepetiçao2) || CpfRepetiçao3.equals(CpfRepetiçao1))   {

                 z = 1;
                 System.out.printf("Erro, CPF ja foi utilizado !!!\n");

             }

         }

         Scanner AgenciaDoCliente = new Scanner(System.in);
         System.out.println("digite a agencia do cliente");
         Agencia = AgenciaDoCliente.nextInt();

         if ( m == 0) {

             this.Conta1.add(String.valueOf(Agencia));

         }

         if ( m == 1) {

             this.Conta2.add(String.valueOf(Agencia));

         }

         if ( m == 2) {

             this.Conta3.add(String.valueOf(Agencia));

         }

         Scanner DataNascimentoCliente = new Scanner(System.in);
         System.out.println("digite a data de nascimento do cliente");
         DataDeNascimento = DataNascimentoCliente.nextLine();

         if ( m == 0) {

             this.Conta1.add(String.valueOf(DataDeNascimento));

         }

         if ( m == 1) {

             this.Conta2.add(String.valueOf(DataDeNascimento));

         }

         if ( m == 2) {

             this.Conta3.add(String.valueOf(DataDeNascimento));

         }

         if ( m == 0) {

             System.out.println("conta1" + Conta1);
             System.out.println("conta2" + Conta2);
             System.out.println("conta3" + Conta3);

         }

         if ( m == 1) {

             System.out.println("conta1" + Conta1);
             System.out.println("conta2" + Conta2);
             System.out.println("conta3" + Conta3);

         }

         if ( m == 2) {

             System.out.println("conta1" + Conta1);
             System.out.println("conta2" + Conta2);
             System.out.println("conta3" + Conta3);

         }

       m++;
     }

     public int SaqueDepositoTransferencia(){

        Scanner DepositoOuNao= new Scanner(System.in);
        System.out.println("deseja depositar uma quantia em sua conta se sim digite 1 se nao digite qualquer outro digito:");
        this.VerificadorDeDeposito = DepositoOuNao.nextInt();

        if (VerificadorDeDeposito == 1){

            Scanner NumeroDeposito= new Scanner(System.in);
            System.out.println("qual quantia deseja depositar");

            Saldo =+ NumeroDeposito.nextInt();

            if ( m == 1) {

                this.Conta1.set(3, String.valueOf(Saldo));

            }

            if ( m == 2) {

                this.Conta2.set(3, String.valueOf(Saldo));

            }

            if ( m == 3) {

                this.Conta3.set(3, String.valueOf(Saldo));

            }

        }

        Scanner SaqueOuNao= new Scanner(System.in);
        System.out.println("deseja sacar uma quantia de sua conta se sim digite 1 se nao digite qualquer outro digito:");
        this.VerificadorDeSaque = SaqueOuNao.nextInt();

        if (VerificadorDeSaque == 1){

            int v=1;

            Scanner NumeroSaque= new Scanner(System.in);
            System.out.println("qual quantia deseja sacar");
            int NumeroSaqueInteiro = NumeroSaque.nextInt();

            while(v != 0){

                if (NumeroSaqueInteiro > Saldo){

                    System.out.println("saldo insuficiente" + Saldo);
                    Scanner NumeroSaqueVerificado= new Scanner(System.in);
                    System.out.println("digite uma quantia valida");

                    int NumeroSaqueInteiroVerificado = NumeroSaqueVerificado.nextInt();
                    System.out.println("valor novo digitado" + NumeroSaqueInteiroVerificado);
                    NumeroSaqueInteiro = NumeroSaqueInteiroVerificado;


                }

                if (NumeroSaqueInteiro <= Saldo){

                    Saldo = Saldo - NumeroSaqueInteiro;




                    if ( m == 1) {


                        this.Conta1.set(3, String.valueOf(Saldo));

                    }

                    if ( m == 2) {
                        this.Conta2.set(3, String.valueOf(Saldo));

                    }

                    if ( m == 3) {
                        this.Conta3.set(3, String.valueOf(Saldo));

                    }

                    v = 0;

                }

            }

        }

        Scanner TransferenciaOuNao= new Scanner(System.in);
        System.out.println("deseja transferir uma quantia de sua conta para outra se sim digite 1 se nao digite qualquer outro digito:");
        this.VerificadorDeTransferencia = TransferenciaOuNao.nextInt();

        int v = 0;

        if (VerificadorDeTransferencia == 1){

            Scanner Transferencia= new Scanner(System.in);
            System.out.println("qual a quantidade que quer tranferir " );
            this.Valor = Transferencia.nextInt();

            while(v != 0){

                if ((Valor > Saldo)){

                    System.out.println("saldo insuficiente" + Saldo);
                    Scanner NumeroSaqueVerificado= new Scanner(System.in);
                    System.out.println("digite uma quantia valida");
                    Valor = NumeroSaqueVerificado.nextInt();

                    v= 1;
                }

            }

            if ( m == 1) {

                Saldo = Saldo - Valor;
                this.Conta1.set(3, String.valueOf(Saldo));

            }

            if ( m == 2) {

                Saldo = Saldo - Valor;
                this.Conta2.set(3, String.valueOf(Saldo));

            }

            if ( m == 3) {

                Saldo = Saldo - Valor;
                this.Conta3.set(3, String.valueOf(Saldo));

            }

            Scanner TransferenciaParaQuem= new Scanner(System.in);
            System.out.println("para qual conta transferir digite 1 para conta 1  digite para a conta 2 ou digite 3 para a conta tres : " );
            NomeParaSaque = TransferenciaParaQuem.nextInt();

            if (NomeParaSaque == 1){

                Valor1 = Valor;

            }

            if (NomeParaSaque == 2){

                Valor2 = Valor;

            }

            if (NomeParaSaque == 3){

                Valor3 = Valor;

            }

        }

        System.out.println(Conta1);
        System.out.println(m);
        System.out.println(Saldo);

        return 0;
     }

 }





