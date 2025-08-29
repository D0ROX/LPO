package src.A02;

import java.util.Scanner;

/**
 * Classe que representa uma vídeo locadora.
 * Permite calcular:
 * 1. Faturamento anual com base na quantidade de DVDs alugados.
 * 2. Valor ganho com multas por atraso.
 *
 * A classe lê do usuário a quantidade de DVDs e o preço do aluguel de cada DVD.
 * Considera que 1/3 dos DVDs são alugados por mês e que 1/10 desses alugados têm atraso,
 * gerando uma multa de 10% do valor do aluguel.
 */
public class VideoLocadora {

    /**
     * Método principal que executa o programa.
     * Lê os dados do usuário, calcula faturamento anual e multas mensais,
     * e exibe os resultados.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Quantidade de DVDs disponíveis na locadora
        int quantDvds = 0;

        // Valor do aluguel de cada DVD
        int precoAluguel = 0;

        // Quantidade de DVDs alugados por mês (1/3 do total)
        int quantAlugada = 0;

        // Valor mensal ganho com multas de atraso
        double multaMensal = 0;

        // Faturamento anual considerando apenas o valor do aluguel
        double faturamentoAnual = 0;

        // Leitura da quantidade de DVDs do usuário
        System.out.println("Informe quantos DVDs sua locadora possui: ");
        quantDvds = sc.nextInt();

        // Leitura do valor do aluguel
        System.out.println("Qual o valor do aluguel de cada DVD? ");
        precoAluguel = sc.nextInt();

        // Calcula quantos DVDs são alugados por mês
        quantAlugada = quantDvds / 3;

        // Calcula o valor mensal das multas (1/10 dos alugados com multa de 10%)
        multaMensal = (quantAlugada * 0.1) * (precoAluguel * 0.1);

        // Calcula o faturamento anual apenas com os alugueis
        faturamentoAnual = quantAlugada * precoAluguel * 12;

        // Exibe o faturamento anual
        System.out.printf("O faturamento anual da locadora é: R$ %.2f\n", faturamentoAnual);

        // Exibe o faturamento mensal com multas
        System.out.printf("O faturamento mensal com multas é: R$ %.2f\n", multaMensal);

        // Fecha o Scanner
        sc.close();
    }
}
