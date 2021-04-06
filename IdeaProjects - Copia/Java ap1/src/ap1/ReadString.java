package ap1;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

import java.util.Scanner;

public class ReadString
 {

    public String LerString() {

        Scanner GetData = new Scanner(System.in);

        System.out.println("digite uma String:");

        String Data = GetData.next();

        System.out.println(Data);

        return LerString();
    }


    public void ReadStringParameter()

    {

        String String = "nome";

        System.out.println(String);

    }

 }