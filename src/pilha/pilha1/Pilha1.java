package pilha.pilha1;

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


