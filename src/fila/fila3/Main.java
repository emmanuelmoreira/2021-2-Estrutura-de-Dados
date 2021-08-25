package fila.fila3;

public class Main {
    public static void main(String[] args) {
        Fila3 fila = new Fila3();

        fila.Dequeue();         //Fila Vazia
        fila.Enqueue(100);
        fila.Enqueue(200);
        fila.Enqueue(300);
        fila.Enqueue(400);
        fila.Enqueue(500);
        fila.ShowQueue();

        System.out.println("\n");
        System.out.println(fila.GetInicioFila());
        System.out.println(fila.GetFimFila());

        System.out.println("\n");
        fila.Enqueue(600); //Fila Cheia

        fila.Dequeue();
        fila.Dequeue();
        fila.Dequeue();
        System.out.println("\n");
        fila.ShowQueue();
        System.out.println("\n");
        System.out.println(fila.getTamanho());
    }
}
