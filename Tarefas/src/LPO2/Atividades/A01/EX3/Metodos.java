package src.LPO2.Atividades.A01.EX3;

import java.util.Scanner;

public class Metodos {


    public static double valorSalarioHora;
    public static double horasTrabalhadas;
    public static double percentualDescontoInss;
    public static double salarioBruto;
    public static double salarioLiquido;

    public static void pedirDados() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Informe o valor do salário hora: ");
            valorSalarioHora = sc.nextDouble(); 
            if (valorSalarioHora < 0) throw new RuntimeException("O valor do salário não pode ser negativo!");

            System.out.println("Informe o número de horas trabalhadas no mês: ");
            horasTrabalhadas = sc.nextDouble();
            if (horasTrabalhadas < 0) throw new RuntimeException("O número de horas não pode ser negativa!");

            System.out.println("Informe o percentual de Desconto do inss: ");
            percentualDescontoInss = sc.nextDouble();
            if (percentualDescontoInss < 0) throw new RuntimeException("A porcentagem não pode ser negativa!");

        } catch (java.util.InputMismatchException e) {
            throw new RuntimeException("Erro: Você deve digitar um número válido!");
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void calcularBruto() {
        salarioBruto = valorSalarioHora * horasTrabalhadas;
    }

    public static void calcularLiquido() {
        salarioLiquido = salarioBruto - (salarioBruto * (percentualDescontoInss / 100));
    }

    public static void imprimeExtrato() {
        System.out.println("\n======= Extrato de Salário =======");
        System.out.printf("Valor Hora:       R$ %.2f \n", valorSalarioHora);
        System.out.printf("Horas trabalhadas: %.0f horas\n", horasTrabalhadas);
        System.out.printf("Salário Bruto:    R$ %.2f \n", salarioBruto);
        System.out.printf("Salário Líquido:  R$ %.2f \n", salarioLiquido);
        System.out.println("==================================");
    }
}