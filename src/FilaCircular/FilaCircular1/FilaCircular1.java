package FilaCircular.FilaCircular1;

public class FilaCircular1 {

        private Integer[] queue;
        private int inicio;
        private int fim;
        private int tamanho;
        private final int SIZE = 5;

        public FilaCircular1() {
            this.queue   = new Integer[SIZE];
            this.inicio  = 0;
            this.tamanho = 0;
            this.fim     = -1;
        }


        public void Enqueue(int valor) {
            if(this.fim==SIZE-1)
                this.fim=-1;
            this.fim++;
            this.queue[this.fim] = valor;
            this.tamanho++;
        }

        public void Dequeue() {
            this.queue[this.inicio] = null;
            this.inicio++;
            if(this.inicio==SIZE)
                this.inicio=0;
            this.tamanho--;
        }

        public void ShowQueue() {
            for (int i = 0; i < queue.length; i++) {
                System.out.print("[" + this.queue[i] + "]");
            }
            System.out.println("");
            System.out.println("Inicio:"+this.inicio);
            System.out.println("Fim:"+this.fim);
            System.out.println("Tamanho:"+this.getTamanho());
            System.out.println("");
        }
        public int getTamanho() {
            return tamanho;
        }

    }




