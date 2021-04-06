package ap1;

// trabalho do Henrique Koster Gomes e do Henri Eduardo Kretschmer Eidt

import java.util.Scanner;

public class ReadInt
 {




        public void LerInt(){

            Scanner GetData = new Scanner(System.in);

            System.out.println("digite um Int:");

            int Data = GetData.nextInt();

            System.out.println(Data);

        }





        public void ReadIntParameter(){

            int Inteiro = (int) (Math.random() *100000);

            System.out.println(Inteiro);

        }







 }
