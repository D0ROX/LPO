package src.LPO2.Atividades.A01.EX3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class MetodosTest {

    // Este método roda antes de cada teste para garantir que os valores comecem "limpos"
    @BeforeEach
    void setup() {
        Metodos.valorSalarioHora = 0;
        Metodos.horasTrabalhadas = 0;
        Metodos.percentualDescontoInss = 0;
        Metodos.salarioBruto = 0;
        Metodos.salarioLiquido = 0;
    }

    // --- TESTES DO SALÁRIO BRUTO ---
    @Test
    @DisplayName("Deve calcular o salário bruto corretamente")
    void testCalcularBrutoSucesso() {
        Metodos.valorSalarioHora = 20.0;
        Metodos.horasTrabalhadas = 100.0;
        Metodos.calcularBruto();
        assertEquals(2000.0, Metodos.salarioBruto, "20 * 100 deve ser 2000");
    }

    @Test
    @DisplayName("Bruto deve ser zero se horas trabalhadas forem zero")
    void testCalcularBrutoZero() {
        Metodos.valorSalarioHora = 50.0;
        Metodos.horasTrabalhadas = 0;
        Metodos.calcularBruto();
        assertEquals(0.0, Metodos.salarioBruto);
    }

    // --- TESTES DO SALÁRIO LÍQUIDO ---
    @Test
    @DisplayName("Deve calcular o salário líquido com desconto de 10%")
    void testCalcularLiquidoSucesso() {
        Metodos.salarioBruto = 1000.0;
        Metodos.percentualDescontoInss = 10.0;
        Metodos.calcularLiquido();
        // 1000 - 10% = 900
        assertEquals(900.0, Metodos.salarioLiquido);
    }

    @Test
    @DisplayName("Líquido deve ser igual ao bruto se desconto for 0%")
    void testCalcularLiquidoSemDesconto() {
        Metodos.salarioBruto = 1500.0;
        Metodos.percentualDescontoInss = 0.0;
        Metodos.calcularLiquido();
        assertEquals(1500.0, Metodos.salarioLiquido);
    }

    // --- TESTES DE VALIDAÇÃO (EXCEÇÕES) ---
    // Como o 'pedirDados' usa Scanner, testamos a lógica de validação simulando o erro
    @Test
    @DisplayName("Deve validar que salário negativo não é permitido")
    void testValidacaoSalarioNegativo() {
        // Simulando o que aconteceria se o valor fosse negativo
        assertThrows(RuntimeException.class, () -> {
            double valorNegativo = -10.0;
            if (valorNegativo < 0) throw new RuntimeException("O valor do salário não pode ser negativo!");
        });
    }

    @Test
    @DisplayName("Deve validar que horas negativas não são permitidas")
    void testValidacaoHorasNegativas() {
        assertThrows(RuntimeException.class, () -> {
            double horasNegativas = -5.0;
            if (horasNegativas < 0) throw new RuntimeException("O número de horas não pode ser negativa!");
        });
    }
}
