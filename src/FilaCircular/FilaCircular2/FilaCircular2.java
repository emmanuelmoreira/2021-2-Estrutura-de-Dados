package FilaCircular.FilaCircular2;

public class FilaCircular2 {

    private final Integer[] queue;
    private int inicio;
    private int fim;
    private int tamanho;
    private final int SIZE = 5;

    public FilaCircular2() {
        this.queue = new Integer[SIZE];
        this.inicio = 0;
        this.tamanho = 0;
        this.fim = -1;
    }

    public boolean isEmpty() {
        return this.fim == -1;
    }

    public boolean isFull() {
        return this.tamanho == this.SIZE;
    }

    public void Enqueue(int valor) {
        try {
            if (this.isFull())
                throw new Exception("Fila Cheia");
            if (this.fim == SIZE - 1)
                this.fim = -1;
            this.fim++;
            this.queue[this.fim] = valor;
            this.tamanho++;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void FilaCircularDequeue() {
        try {
            if (this.isEmpty())
                throw new Exception("Fila Vazia");
            this.queue[this.inicio] = null;
            this.inicio++;
            this.tamanho--;
            if (this.inicio == this.SIZE - 1)
                inicio = 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void ShowQueue() {
        for (Integer i : queue) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
        System.out.println("Inicio:" + this.inicio);
        System.out.println("Fim:" + this.fim);
        System.out.println("Tamanho:" + this.getTamanho());
        System.out.println();
    }

    public int getTamanho() {
        return tamanho;
    }

}




