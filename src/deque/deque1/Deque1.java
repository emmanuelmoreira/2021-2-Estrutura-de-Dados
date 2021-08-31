package deque.deque1;

public class Deque1 {

        private Integer[] queue;
        private int inicio;
        private int fim;
        private int tamanho;
        private final int SIZE = 5;

        public Deque1() {
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

        public void DequeueInicio() {
            this.queue[this.inicio] = null;
            this.inicio++;
            this.tamanho--;
        }

        public void DequeueFim() {
            this.queue[this.fim] = null;
            this.fim--;
            this.tamanho--;
    }

        public void ShowQueue() {
            for (int i = 0; i < queue.length; i++) {
                System.out.print("[" + this.queue[i] + "]");
            }
            System.out.println("\n");
        }

        public int getTamanho() {
            return tamanho;
        }

    }