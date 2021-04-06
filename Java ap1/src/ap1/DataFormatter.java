package ap1;

import java.util.Scanner;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

public class DataFormatter
 {


    public String FormatarData() {

        Scanner GetData = new Scanner(System.in);
        System.out.println("digite a data a formatar:");


        String DATA = GetData.next() ;

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











      return FormatarData();

    }













 }
