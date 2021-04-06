package ap1;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

import java.util.Scanner;

public class PhoneVerify
 {


    public String VerifIcarNumero(){
        Scanner GetNumber = new Scanner(System.in);
        System.out.println("digite o numero :");
        String Number = GetNumber.next();

        String Verification = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ";

        int NumberCheck = 1;

        for (int Position = 0; Position <= 49; Position++){

            char Result = Verification.charAt(Position);

            String Letter = String.valueOf(Result);


            if (Number.contains(Letter)) {

                NumberCheck = 0;

                break;
            }



        }

        int DivisionCheck = 1;

        char Divisor = Number.charAt(3);

        String DivisorString = String.valueOf(Divisor);

        if (!DivisorString.equals("-")){

            DivisionCheck = 0;

        }

        int NumberQuantify = 1;

        char Quantities = Number.charAt(11);

        String QuantityString = String.valueOf(Quantities);

        if (QuantityString == null){

            NumberQuantify = 0;

        }



        if (NumberCheck == 1 && NumberQuantify == 1 && DivisionCheck == 1)
        {

            System.out.println("o numero de telefone esta correto : " + Number);

        }

        else
        {

            System.out.println("null");

        }


        return VerifIcarNumero();
    }


 }
