package fila.fila3;

public class Fila3 {

    private Integer[] queue;
    private int inicio;
    private int fim;
    private int tamanho;
    private final int SIZE = 5;

    public Fila3() {
        this.queue   = new Integer[SIZE];
        this.inicio  = 0;
        this.tamanho = 0;
        this.fim     = -1;
    }

    public boolean isFull() {
        return this.fim == SIZE - 1;
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

    public boolean isEmpty() {
        return this.fim == -1;
    }

    public void Dequeue() {
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

    public void ShowQueue() {
        for (Integer integer : queue) {
            System.out.print("[" + integer + "]");
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public String GetInicioFila(){
        return "["+this.inicio+"]"+this.queue[this.inicio]+"<-inicio";
    }
    public String GetFimFila(){
        return "["+this.fim+"]"+this.queue[this.fim]+"<-fim";
    }
}
