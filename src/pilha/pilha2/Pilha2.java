package pilha.pilha2;


public class Pilha2 {
    private int topo;
    private final int SIZE = 5;
    private Integer[] stack;

    public Pilha2() {
        this.stack = new Integer[SIZE];
        this.topo = -1;
    }

    public boolean isFull() {
        if (this.topo == SIZE - 1)
            return true;
        else
            return false;
    }

    public void Push(int valor)  {
        try {
            if (this.isFull())
                throw new Exception("Pilha Cheia");
            this.topo++;
            this.stack[this.topo] = valor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean isEmpty() {
        if (this.topo == -1)
            return true;
        else
            return false;
    }
    public void Pop()  {
        try {
            if (this.isEmpty() )
                throw new Exception("Pilha Vazia");
        this.stack[this.topo] = null;
        this.topo--;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void ShowStack() {
        for (int i = SIZE - 1; i >= 0; i--) {
            System.out.println("[" + i + "] " + this.stack[i]);
        }
    }

}


