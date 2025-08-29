package src.A02;

import java.util.Scanner;

public class VelocidadeMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempoGasto = 0;
        double distanciaPercorrida = 0;
        double velocidadeMedia = 0;

        System.out.println("Informe quantos km você percorreu: ");
        distanciaPercorrida = sc.nextDouble();

        System.out.println("Informe quantas horas durou a viagem: ");
        tempoGasto = sc.nextDouble();

        velocidadeMedia = distanciaPercorrida / tempoGasto;

        System.out.printf("A velocidade média dessa viagem foi de %.2fkm/h", velocidadeMedia);
    }

}
