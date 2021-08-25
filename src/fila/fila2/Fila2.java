package fila.fila2;

public class Fila2 {

    public class Fila1 {

        private Integer[] queue;
        private int inicio;
        private int fim;
        private int tamanho;
        private final int SIZE = 5;

        public Fila1() {
            this.queue = new Integer[SIZE];
            this.inicio = 0;
            this.tamanho = 0;
            this.fim = -1;
        }

        public boolean isFull() {
            if (this.fim == SIZE - 1)
                return true;
            else
                return false;
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
            if (this.fim == -1)
                return true;
            else
                return false;
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
            for (int i = 0; i < queue.length; i++) {
                System.out.print("[" + this.queue[i] + "]");
            }
        }

        public int getTamanho() {
            return tamanho;
        }

    }


}
