package ap1;

import java.util.Scanner;

public class DataVerifier
 {


    public String VerificarData()
    {
        Scanner GetData = new Scanner(System.in);
        System.out.println("digite a data a verificar:");

        String Data = GetData.next();

        String Verification = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ";

        int NumberCheck = 1;

        for (int Position = 0; Position <= 49; Position++){

            char Result = Verification.charAt(Position);

            String Letter = String.valueOf(Result);


            if (Data.contains(Letter)){

                NumberCheck = 0;

            }



        }

        int DayCheck = 1;

        char Day = Data.charAt(0);

        String DayString = String.valueOf(Day);

        if (DayString.equals(String.valueOf(3))){

            char DayNumeral = Data.charAt(1);

            String DayNumeralString = String.valueOf(DayNumeral);

            int DayNumeralInt = Integer.parseInt(DayNumeralString);

            if (DayNumeralInt > 1){

                DayCheck = 0;

                System.out.println("o Daycheck if:" + DayCheck );
            }

        }

        int MonthCheck = 1;

        char Month = Data.charAt(1);

        String MonthString = String.valueOf(Month);

        if (MonthString.equals(String.valueOf(3))){

            char MonthNumeral = Data.charAt(4);

            String MonthNumeralString = String.valueOf(MonthNumeral);

            int MonthNumeralInt = Integer.parseInt(MonthNumeralString);

            if (MonthNumeralInt > 2){

                MonthCheck = 0;

                System.out.println("o Monthcheck if:" + MonthCheck );

            }

        }



        if (NumberCheck == 1 && DayCheck == 1 && MonthCheck == 1 ){

            System.out.println("a data esta correta  :" + Data);

        }

        else{

            System.out.println("null");

        }

        return VerificarData();

    }












 }





