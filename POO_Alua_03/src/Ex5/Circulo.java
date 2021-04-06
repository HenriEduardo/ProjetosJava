package Ex5;

import java.util.Scanner;

public class Circulo {

    int raio;
    float area;
    Scanner ler = new Scanner(System.in);

    public void lerRaio(){
        System.out.println("Digite o raio do círculo em cm: ");
        raio = ler.nextInt();
    }

    public void calcularArea(){
        area = (float) ((raio*raio) * 3.14);
    }

    public void mostrarArea() {
        System.out.println("A área do círculo é: " +area);
    }

}
