package ap1;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

import java.util.Scanner;

public class ReadChar
 {

        public char LerChar(){

            Scanner GetData = new Scanner(System.in);

            System.out.println("digite um char:");

            String Linha = GetData.next();

            char Data = Linha.charAt(0);

            System.out.println(": " + Data);

            return LerChar();

        }


        public char ReadCharParameter(){

            String Data = "f";

            char Linha = Data.charAt(0);

            return ReadCharParameter();

        }





 }

