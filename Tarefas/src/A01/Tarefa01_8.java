package src.A01;

import java.util.Scanner;

public class Tarefa01_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("Informe seu primeiro e seu ultimo nome: ");
        nome = sc.nextLine();

        String[] separaNome = nome.split(" ");

        for(int i = separaNome.length-1; i >= 0; i--){
            System.out.println(separaNome[i]);
        }
    }
}