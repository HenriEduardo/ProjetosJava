package Ex5;

import java.util.Scanner;

public class Retangulo {

    int base, altura;
    float area;
    Scanner ler = new Scanner(System.in);

    public void lerAltura(){
        System.out.println("Digite a altura do retângulo em cm: ");
        altura = ler.nextInt();
    }

    public void lerBase(){
        System.out.println("Digite a base do retângulo em cm: ");
        base = ler.nextInt();
    }

    public void calcularArea(){
        area = base*altura;
    }

    public void mostrarArea() {
        System.out.println("A área do retângulo é: " +area);
    }

}
