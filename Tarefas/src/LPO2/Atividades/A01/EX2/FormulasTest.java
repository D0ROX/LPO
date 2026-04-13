package src.LPO2.Atividades.A01.EX2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FormulasTest {

    // --- TESTES DO RETÂNGULO ---
    @Test
    @DisplayName("Deve calcular a área do retângulo corretamente")
    void testCalculaAreaRetanguloSucesso() {
        assertEquals(50.0, Formulas.calculaAreaRetangulo(10, 5), "10 * 5 deve ser 50");
    }

    @Test
    @DisplayName("Deve lançar exceção para retângulo com lado negativo")
    void testCalculaAreaRetanguloErro() {
        assertThrows(RuntimeException.class, () -> {
            Formulas.calculaAreaRetangulo(-2, 5);
        }, "Lado negativo deve disparar RuntimeException");
    }

    // --- TESTES DA CIRCUNFERÊNCIA ---
    @Test
    @DisplayName("Deve calcular a área da circunferência corretamente")
    void testCalculaAreaCircunferenciaSucesso() {
        // Raio 2 -> PI * 2² = 12.566...
        double esperado = Math.PI * 4;
        assertEquals(esperado, Formulas.calculaAreaCircunferencia(2), 0.0001);
    }

    @Test
    @DisplayName("Deve lançar exceção para raio negativo")
    void testCalculaAreaCircunferenciaErro() {
        assertThrows(RuntimeException.class, () -> {
            Formulas.calculaAreaCircunferencia(-1);
        });
    }

    // --- TESTES DO TRIÂNGULO ---
    @Test
    @DisplayName("Deve calcular a área do triângulo corretamente")
    void testCalculaAreaTrianguloSucesso() {
        // (Base 10 * Altura 5) / 2 = 25
        assertEquals(25.0, Formulas.calculaAreaTriangulo(10, 5));
    }

    @Test
    @DisplayName("Deve lançar exceção para triângulo com base ou altura negativa")
    void testCalculaAreaTrianguloErro() {
        assertThrows(RuntimeException.class, () -> {
            Formulas.calculaAreaTriangulo(10, -5);
        });
    }
}