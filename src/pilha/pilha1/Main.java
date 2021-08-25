package pilha.pilha1;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();



        pilha.Push(10); //[10]
        pilha.Push(20); //[10] [20]
        pilha.Push(30); //[10] [20] [30]
        pilha.ShowStack();
        System.out.println("\n");
        pilha.Pop();//[10] [20]
        pilha.Pop();//[10]
        pilha.ShowStack();


    }
}
