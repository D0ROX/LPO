package src.LPO2.Atividades.A04_Genericos.EX07;

public class Pilha<T> {

    private T[] elementos;
    private int topo;

    @SuppressWarnings("unchecked")
    public Pilha() {
        elementos = (T[]) new Object[10];
        topo = 0;
    }

    public void empilha(T elemento) {
        if (topo == elementos.length) {
            aumentarCapacidade();
        }

        elementos[topo] = elemento;
        topo++;
    }

    public T desempilha() {
        if (estaVazia()) {
            return null;
        }

        topo--;
        T elemento = elementos[topo];
        elementos[topo] = null;

        return elemento;
    }

    public boolean estaVazia() {
        return topo == 0;
    }

    @SuppressWarnings("unchecked")
    private void aumentarCapacidade() {
        T[] novoArray = (T[]) new Object[elementos.length * 2];

        for (int i = 0; i < elementos.length; i++) {
            novoArray[i] = elementos[i];
        }

        elementos = novoArray;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");

        for (int i = topo - 1; i >= 0; i--) {
            sb.append(elementos[i]);

            if (i > 0) {
                sb.append(" , ");
            }
        }

        sb.append(" ]");
        return sb.toString();
    }
}
