package Ex5;

import java.util.Scanner;

public class Triangulo {

    int base, altura;
    float area;
    Scanner ler = new Scanner(System.in);

    public void lerAltura(){
        System.out.println("Digite a altura do triângulo em cm: ");
        altura = ler.nextInt();
    }

    public void lerBase(){
        System.out.println("Digite a base do triângulo em cm: ");
        base = ler.nextInt();
    }

    public void calcularArea(){
        area = (base*altura)/2;
    }

    public void mostrarArea() {
        System.out.println("A área do triângulo é: " +area);
    }

}
