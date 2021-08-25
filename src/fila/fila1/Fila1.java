package fila.fila1;

public class Fila1 {

    private Integer[] queue;
    private int inicio;
    private int fim;
    private int tamanho;
    private final int SIZE = 5;

    public Fila1() {
        this.queue   = new Integer[SIZE];
        this.inicio  = 0;
        this.tamanho = 0;
        this.fim     = -1;
    }


    public void Enqueue(int valor) {
        this.fim++;
        this.queue[this.fim] = valor;
        this.tamanho++;
    }

    public void Dequeue() {
        this.queue[this.inicio] = null;
        this.inicio++;
        this.tamanho--;
    }

    public void ShowQueue() {
        for (int i = 0; i < queue.length; i++) {
            System.out.print("[" + this.queue[i] + "]");
        }
    }
    public int getTamanho() {
        return tamanho;
    }

}


