package fila.fila2;

public class Main {
    public static void main(String[] args) {
        Fila2 fila = new Fila2();
        fila.Dequeue();
        fila.Enqueue(10);
        fila.Enqueue(20);
        fila.Enqueue(30);
        fila.Enqueue(40);
        fila.Enqueue(50);
        fila.Enqueue(60);
        fila.ShowQueue();
        fila.Dequeue();
        fila.Dequeue();
        System.out.println("\n");
        fila.ShowQueue();
        System.out.println("\n");
        System.out.println(fila.getTamanho()+" Elementos");
    }
}
