package src.A02;

import java.util.Scanner;

public class DistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1,y1,x2,y2;

        System.out.println("Informe o valor de x1: ");
        x1 = sc.nextDouble();

        System.out.println("Informe o valor de y1: ");
        y1 = sc.nextDouble();

        System.out.println("Informe o valor de x2: ");
        x2 = sc.nextDouble();

        System.out.println("Informe o valor de y2: ");
        y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("A distancia entre os pontos é de: %.2f", distancia);
    }
}
