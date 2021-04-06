package ap1;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

import java.util.Scanner;

public class PhoneVerify
 {


     private int NumberCheck;

     public String VerifIcarNumero(){

         Scanner lerTel = new Scanner(System.in);
         String telefone;
         String regex = "\\d*";

         System.out.print("Digite um número de telefone: ");
         telefone = lerTel.nextLine();

         if (telefone.length() == 11 && telefone.matches(regex)){
             System.out.println("(" + telefone.substring(0, 2) + ")" + telefone.substring(2, 7) + "-" + telefone.substring(7, 11));
         }else{
             System.out.println("null");
         }

         return telefone;

     }


 }
