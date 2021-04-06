package ap1;

import java.util.Scanner;
public class Email
 {

    public void ValidarEmail()
    {

        Scanner GetEmail = new Scanner(System.in);

        System.out.println("digite o email:");

        String Email = GetEmail.next();


        int EmailCheck = 0;

        if (Email.contains("@")){

            EmailCheck = 1;

        }

        String WordType = String.valueOf(Email.charAt(0));
        int WordCheck = 1;

        if (WordType.equals("@")){

            WordCheck = 0;

        }

        int DotCheck = 0;

        if (Email.contains(".com")){

            DotCheck = 1;

        }

        int Identify = 1;

        char IdentifierChar = Email.charAt(0);

        String IdentifierString = String.valueOf(IdentifierChar);

        if (IdentifierString.equals("@")){

            Identify = 0;

        }

        if (Identify == 1 && DotCheck == 1 && EmailCheck == 1 && WordCheck == 1){

            System.out.println("O email está correto : " + Email);

        }

        else{

            System.out.println("null");

        }

    }

 }




