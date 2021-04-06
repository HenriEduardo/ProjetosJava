package ap1;

import java.util.Scanner;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

public class NumberVerify
 {

    public void VerificarNumero(){

        Scanner GetData = new Scanner(System.in);

        System.out.println("digite um número:");

        String Number = GetData.next();

        String Verification = "abcdefghijklmnopqrstuvxyzçABCDEFGHIJKLMNOPQRSTUVXYZÇ";

        int NumberCheck = 1;

        for (int Position = 0; Position <= 51; Position ++){

            char Result = Verification.charAt(Position);

            String Letter = String.valueOf(Result);


            if (Number.contains(Letter)){

                NumberCheck = 0;

            }

        }

        if (NumberCheck == 1){


            System.out.println("O número é válido:" + Number );

        }

        else {

            System.out.println("O número é inválido:" + Number );

        }

    }

 }