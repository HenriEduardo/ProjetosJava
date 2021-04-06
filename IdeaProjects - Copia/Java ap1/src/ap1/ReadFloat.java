package ap1;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

import java.util.Scanner;

public class ReadFloat
 {



        public void LerFloat(){

            Scanner GetData = new Scanner(System.in);

            System.out.println("digite um float:");

            float Data = GetData.nextFloat();

            System.out.println(Data);

        }




        public void LerFloatParameter(){

            float Float = (float) (Math.random() *100000);

            System.out.println(Float);

        }

 }
