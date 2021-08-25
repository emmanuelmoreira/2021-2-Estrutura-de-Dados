package pilha.pilha2;

public class Main {
    public static void main(String[] args) {
        Pilha2 pilha = new Pilha2();

        pilha.Pop(); //Pilha vazia
        pilha.Push(10);
        pilha.Push(20);
        pilha.Push(30);
        pilha.Push(40);
        pilha.Push(50);
        pilha.Push(60); //Pilha Cheia
        pilha.ShowStack();
        System.out.println("\n");
        pilha.Pop();
        pilha.Pop();
        pilha.ShowStack();

    }


}
