package ap1;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

import java.util.Scanner;

public class ReadDouble
 {



        public String LerDouble(){

            Scanner GetData = new Scanner(System.in);

            System.out.println("digite um Double:");

            Double Data = GetData.nextDouble();

            System.out.println(":" + Data);

            return LerDouble();
        }




        public String ReadDoubleParameter(){



            Double Data = 254.5654;

            System.out.println(":" + Data);

            return LerDouble();



        }





 }
