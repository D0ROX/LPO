package src.A01;

import java.util.Scanner;

public class Tarefa01_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2;
        char op;
        double resultado = 0;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.println("Digite a operação desejada: ");
        op = sc.next().charAt(0);

        switch (op){
            case '+':
                resultado = n1+n2;
                break;
            case '-':
                resultado = n1-n2;
                break;
            case '*':
                resultado = n1*n2;
                break;
            case '/':
                resultado = n1/n2;
                break;
            default:
                System.out.println("Operação inválida, tente novamente! ");
        }

        System.out.println("O resultado é: " + resultado);

        sc.close();
    }
}
