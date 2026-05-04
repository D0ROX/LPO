package src.LPO2.Atividades.A04_Genericos.EX08;

public class Quadrado implements Superficie {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}