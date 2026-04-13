package src.LPO2.Atividades.A01.EX2;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

         int escolha = 0;

        Scanner sc = new Scanner(System.in);


        System.out.println("Você deseja calcular a área de qual forma geométrica? \n 1-Retangulo \t2-Circunferencia \t3-Triangulo");
        escolha = sc.nextInt();
        
         double resultado = 0;
        try {

             switch (escolha) {
            case 1:
                        System.out.println("Informe o tamanho do lado 1: ");
                        double lado1 = sc.nextDouble();

                        System.out.println("Informe o tamanho do lado 2: ");
                        double lado2 = sc.nextDouble();
                        
                        
                        resultado =  Formulas.calculaAreaRetangulo(lado1 , lado2);

                        System.out.println("A área do retângulo é " + resultado);
                    
                break;
        case 2:
                
                    System.out.println("Informe o raio da circunferência ");
                            double raio = sc.nextDouble();
                            
                            resultado =  Formulas.calculaAreaCircunferencia(raio);

                            System.out.println("A área da circunferência é " + resultado);
                break;
        case 3:
                        System.out.println("Informe o tamanho da base: ");
                        double base = sc.nextDouble();

                        System.out.println("Informe o tamanho da altura: ");
                        double altura = sc.nextDouble();
                        
                        
                        resultado =  Formulas.calculaAreaTriangulo(base, altura);

                        System.out.println("A área do triângulo é " + resultado);
                break;

            default:
                    System.out.println("Erro: Digite uma opção válida! ");
                break;
        }
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

       

        sc.close();

    }

    
}
    
