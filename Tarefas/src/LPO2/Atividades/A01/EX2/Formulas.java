package src.LPO2.Atividades.A01.EX2;
public class Formulas {

    public static double calculaAreaRetangulo(double lado1, double lado2){

        if (lado1 < 0 || lado2 < 0){
            throw new RuntimeException("Erro: Não é possível calcular área com números negativos!");
        } else {
             return lado1 * lado2;
        }
       
    };

    public static double calculaAreaCircunferencia(double raio){
         if (raio < 0 ){
            throw new RuntimeException("Erro: Não é possível calcular área com números negativos!");
        } else {
             return (raio * raio ) * Math.PI;
        }
        
        
    };

    public static double calculaAreaTriangulo(double base, double altura){

         if (base < 0 || altura < 0 ){
            throw new RuntimeException("Erro: Não é possível calcular área com números negativos!");
        } else {
             return (base * altura) / 2;
        }
        
    }
    
}
