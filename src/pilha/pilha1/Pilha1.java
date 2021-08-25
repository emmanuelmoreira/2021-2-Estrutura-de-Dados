package pilha.pilha1;


/*
Inserções e Remoções são realizadas no topo da pilha.

Pilha(): Construtor
topo: recebe -1 pois a cada inserção é incrementado o topo, assim na primeira inserção topo valerá 0 ou seja a priemira posição de um vetor
Pop(): Desempilha, retira elemento de uma pilha.
Push()
ShowStack()


 */
public class Pilha1 {
    private int topo;
    private final int SIZE = 5;
    private Integer[] stack;

        public Pilha1() {
            this.stack = new Integer[SIZE];
            this.topo = -1;
    }

        public void Push(int valor) {
            this.topo++;
            this.stack[this.topo] = valor;
        }

        public void Pop() {
            this.stack[this.topo] = null;
            this.topo--;
        }


    public void ShowStack() {
        for (int i = 0; i < this.SIZE; i++) {
            System.out.println("[" + i + "] " + this.stack[i]);
        }
    }

    }


