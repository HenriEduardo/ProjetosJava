package com.company;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {

//    public static void main(String[] args) {
//
//        String nome = new String();
//        Scanner tc = new Scanner(System.in);
//        System.out.print("Digite apenas seu primeiro nome: ");
//        nome = tc.next();
//        System.out.println(nome);
//
//    }

//    public static void main(String[] args) {
//
//        double valor = 199.99;
//        System.out.println(valor);
//
//    }

//    public static void main(String[] args) {
//
//        Scanner Valid = new Scanner(System.in);
//
//        System.out.println("Digite algo: ");
//
//        String NumberNot = Valid.next();
//
//        NumberNot = NumberNot.toLowerCase();
//
//        int verification = 1;
//
//        if (NumberNot.contains( "a")){
//
//            verification = 0;
//
//        }
//        if (NumberNot.contains( "b")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "c")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "d")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "e")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "f")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "g")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "h")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "i")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "j")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "k")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "l")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "m")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "n")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "o")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "p")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "q")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "r")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "s")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "t")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "u")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "u")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "v")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "x")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "y")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "z")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "a")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "a")){
//
//            verification = 0;
//        }
//        if (NumberNot.contains( "a")){
//
//            verification = 0;
//        }
//
//        if (verification == 1) {
//
//            System.out.println("É um digito numerico!! ");
//
//        }
//
//        else {
//
//            System.out.println("Não é um dígito numérico!! ");
//
//        }
//
//    }

    public static void main(String[] args) {

        String DATA = "21/08/2020" ;
        Scanner ler_data = new Scanner(System.in);
        System.out.println("Digite a data: ");
        DATA = ler_data.next();

        char DiaDecimal = DATA.charAt(0);
        char DiaNumeral = DATA.charAt(1);

        char MesDecimal = DATA.charAt(3);
        char MesNumeral = DATA.charAt(4);

        char AnoMilhar = DATA.charAt(6);
        char AnoCentena = DATA.charAt(7);
        char AnoDecimal = DATA.charAt(8);
        char AnoNumeral = DATA.charAt(9);

        String DataCorrigida = "" ;
        DataCorrigida += MesDecimal;
        DataCorrigida += MesNumeral;
        DataCorrigida += "/" ;
        DataCorrigida += DiaDecimal;
        DataCorrigida += DiaNumeral;
        DataCorrigida += "/" ;
        DataCorrigida += AnoMilhar;
        DataCorrigida += AnoCentena;
        DataCorrigida += AnoDecimal;
        DataCorrigida += AnoNumeral;

        System.out.println("data corrigida: " + DataCorrigida);

    }

//    public static void main(String[] args){
//
//        String data = new String();
//        Scanner ler_data = new Scanner(System.in);
//        System.out.print("Digite a data: ");
//        data = ler_data.next();
//
//        String Verification = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ";
//
//        int NumberCheck = 1;
//
//        for (int Position = 0; Position <= 49; Position++){
//
//            char Result = Verification.charAt(Position);
//
//            String Letter = String.valueOf(Result);
//
//            if (data.contains(Letter)){
//
//                NumberCheck = 0;
//
//            }
//
//            System.out.println("o numbercheck else:" + NumberCheck );
//
//        }
//
//        int DayCheck = 1;
//
//        char Day = data.charAt(0);
//
//        String DayString = String.valueOf(Day);
//
//        if (DayString.equals(String.valueOf(3))){
//
//            char DayNumeral = data.charAt(1);
//
//            String DayNumeralString = String.valueOf(DayNumeral);
//
//            int DayNumeralInt = Integer.parseInt(DayNumeralString);
//
//            if (DayNumeralInt > 1){
//
//                DayCheck = 0;
//
//                System.out.println("o Daycheck if:" + DayCheck );
//            }
//
//        }
//
//        int MonthCheck = 1;
//
//        char Month = data.charAt(1);
//
//        String MonthString = String.valueOf(Month);
//
//        if (MonthString.equals(String.valueOf(1))){
//
//            char MonthNumeral = data.charAt(4);
//
//            String MonthNumeralString = String.valueOf(MonthNumeral);
//
//            int MonthNumeralInt = Integer.parseInt(MonthNumeralString);
//
//            if (MonthNumeralInt > 2){
//
//                MonthCheck = 0;
//
//                System.out.println("o Monthcheck if:" + MonthCheck );
//
//            }
//
//        }
//
//        if (NumberCheck == 1 && DayCheck == 1 && MonthCheck == 1 )
//        {
//
//            System.out.println("the Date is:" + data);
//
//        }
//
//        else
//        {
//
//            System.out.println("null");
//
//        }
//
//    }

//    public static void main(String[] args){
//
//        String Number = "555-13457155";
//
//        String Verification = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVXYZ";
//
//        int NumberCheck = 1;
//
//        for (int Position = 0; Position <= 49; Position++){
//
//            char Result = Verification.charAt(Position);
//
//            String Letter = String.valueOf(Result);
//
//
//            if (Number.contains(Letter)) {
//
//                NumberCheck = 0;
//
//                break;
//            }
//
//        }
//
//        int DivisionCheck = 1;
//
//        char Divisor = Number.charAt(3);
//
//        String DivisorString = String.valueOf(Divisor);
//
//        if (!DivisorString.equals("-")){
//
//            DivisionCheck = 0;
//
//        }
//
//        int NumberQuantify = 1;
//
//        char Quantities = Number.charAt(11);
//
//        String QuantityString = String.valueOf(Quantities);
//
//        if (QuantityString == null){
//
//            NumberQuantify = 0;
//
//        }
//
//        if (NumberCheck == 1 && NumberQuantify == 1 && DivisionCheck == 1)
//        {
//
//            System.out.println("the phone number is : " + Number);
//
//        }
//
//        else
//        {
//
//            System.out.println("null");
//
//        }

//    }

//    public static void main(String[] args){
//
//        String email = new String();
//        Scanner ler = new Scanner(System.in);
//        System.out.print("Digite seu e-mail: ");
//        email = ler.next();
//
//        int EmailCheck = 0;
//
//        if (email.contains("@")) {
//
//            EmailCheck = 1;
//
//        }
//
//        String WordType = String.valueOf(email.charAt(0));
//        int WordCheck = 1;
//
//        if (WordType.equals("@"))
//
//        {
//
//            WordCheck = 0;
//
//        }
//
//        int DotCheck = 0;
//
//        if (email.contains(".com")){
//
//            DotCheck = 1;
//
//        }
//
//        int Identify = 1;
//
//        char IdentifierChar = email.charAt(0);
//
//        String IdentifierString = String.valueOf(IdentifierChar);
//
//        if (IdentifierString.equals("@")){
//
//            Identify = 0;
//
//        }
//
//        if (Identify == 1 && DotCheck == 1 && EmailCheck == 1 && WordCheck == 1)
//        {
//
//            System.out.println("Seu e-mail é: " + email);
//
//        }
//
//        else {
//
//            System.out.println("null");
//
//        }
//
//    }

}
