package solucao.forma;

import java.util.Scanner;

public class main {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite forma que deseja calcular\n");
    String lido = sc.nextLine();

    switch(lido){
        case "circulo":
            System.out.println("Digite o raio:");
            double raio = sc.nextDouble();
            Forma circulo = new Circulo(raio);
            System.out.println(circulo.area());
            break;

        case "triangulo":
            System.out.println("Digite a base:");
            double base = sc.nextDouble();
            System.out.println("Digite a altura:");
            double altura = sc.nextDouble();
            Forma triangulo = new Triangulo(base, altura);
            System.out.println(triangulo.area());
            break;

        case "quadrado":
            System.out.println("Digite o lado:");
            double lado = sc.nextDouble();
            Forma quadrado = new Quadrado(lado);
            System.out.println(quadrado.area());
            break;

        case "retangulo":
            System.out.println("Digite o comprimento:");
            double comprimento = sc.nextDouble();
            System.out.println("Digite a altura:");
            double alturaRetangulo = sc.nextDouble();
            Forma retangulo = new Retangulo(comprimento, alturaRetangulo);
            System.out.println(retangulo.area());
            break;


    }


}
