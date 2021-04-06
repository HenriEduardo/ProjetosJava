package ap1;

import java.util.Scanner;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

public class NumberVerify
 {


    public String VerificarNumero(){

        Scanner GetData = new Scanner(System.in);

        System.out.println("digite um numero:");

        String Number = GetData.next();

        String Verification = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ";

        int NumberCheck = 1;

        for (int Position = 0; Position <= 49; Position ++){

            char Result = Verification.charAt(Position);

            String Letter = String.valueOf(Result);


            if (Number.contains(Letter)){

                NumberCheck = 0;

            }


        }

        if (NumberCheck == 1){


            System.out.println("o numero e valido:" + Number );


        }


        else {


            System.out.println("o numero e invalido:" + Number );


        }


      return VerificarNumero();

    }




 }