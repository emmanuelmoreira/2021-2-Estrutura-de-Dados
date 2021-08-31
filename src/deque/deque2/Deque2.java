package deque.deque2;

public class Deque2 {

    private final Integer[] queue;
    private int inicio;
    private int fim;
    private int tamanho;
    private final int SIZE = 5;

    public boolean isEmpty() {
        return this.fim == -1;
    }

    public boolean isFull() {
        return this.fim == SIZE - 1;
    }

    public Deque2() {
        this.queue = new Integer[SIZE];
        this.inicio = 0;
        this.tamanho = 0;
        this.fim = -1;
    }

    public void Enqueue(int valor) {
        try {
            if (this.isFull())
                throw new Exception("Fila Cheia");
            this.fim++;
            this.queue[this.fim] = valor;
            this.tamanho++;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void DequeueInicio() {
        try {
            if (this.isEmpty())
                throw new Exception("Fila Vazia");
            this.queue[this.inicio] = null;
            this.inicio++;
            this.tamanho--;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void DequeueFim() {
        try {
            if (this.isEmpty())
                throw new Exception("Fila Vazia");
            this.queue[this.fim] = null;
            this.fim--;
            this.tamanho--;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ShowQueue() {
        for (Integer i : queue) {
            System.out.print("[" + i + "]");
        }
        System.out.println("\n");
    }

    public int getTamanho() {
        return tamanho;
    }

}
