package src.LPO2.Atividades.A04_Genericos.EX08;

public class SomaAreas {

    public <T extends Superficie> double calculaArea(T[] superficies) {
        double soma = 0.0;

        for (T superficie : superficies) {
            soma += superficie.area();
        }

        return soma;
    }
}
