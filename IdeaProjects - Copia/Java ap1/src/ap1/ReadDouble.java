package ap1;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

import java.util.Random;
import java.util.Scanner;

public class ReadDouble
 {

        public void LerDouble(){

            Scanner GetData = new Scanner(System.in);

            System.out.println("digite um Double:");

            double Data = GetData.nextDouble();

            System.out.println(Data);

        }


        public void ReadDoubleParameter(){

            Random random = new Random();

            double Double = random.nextDouble() *100000;

            System.out.println(Double);
        }





 }
