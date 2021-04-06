package Ex5;

import java.util.Scanner;

public class Quadrado {

    int base, altura;
    float area;
    Scanner ler = new Scanner(System.in);

    public void lerAltura(){
        System.out.println("Digite a altura do quadrado em cm: ");
        altura = ler.nextInt();
    }

    public void lerBase(){
        System.out.println("Digite a base do quadrado em cm: ");
        base = ler.nextInt();
    }

    public void calcularArea(){
        area = base*altura;
    }

    public void mostrarArea() {
        System.out.println("A área do quadrado é: " +area);
    }

}
