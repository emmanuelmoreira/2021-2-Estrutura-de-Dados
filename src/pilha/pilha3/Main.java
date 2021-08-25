package pilha.pilha3;

public class Main {
    public static void main(String[] args) {
        Pilha3 pilha = new Pilha3();

        pilha.Pop(); //Pilha vazia
        pilha.Push(100);
        pilha.Push(200);
        pilha.Push(300);
        pilha.Push(400);
        pilha.Push(500);
        pilha.Push(600); //Pilha Cheia
        pilha.ShowStack();
        System.out.println("\n");
        pilha.Pop();
        pilha.Pop();
        pilha.ShowStack();

        System.out.println(pilha.Peek());

    }


}
