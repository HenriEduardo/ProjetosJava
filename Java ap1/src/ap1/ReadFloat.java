package ap1;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

import java.util.Scanner;

public class ReadFloat
 {



        public Float LerFloat(){

            Scanner GetData = new Scanner(System.in);

            System.out.println("digite um float:");

            float Data = GetData.nextFloat();

            System.out.println(":" + Data);

            return LerFloat();
        }




        public Float LerFloatParameter(){

            float Data = 72;

            System.out.println(":" + Data);

            return LerFloatParameter();
        }





 }
