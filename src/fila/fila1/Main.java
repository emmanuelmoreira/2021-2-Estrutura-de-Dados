package fila.fila1;

public class Main {
    public static void main(String[] args) {
        Fila1 fila = new Fila1();

        fila.Enqueue(10);//[10]
        fila.Enqueue(20);//[10] [20]
        fila.Enqueue(30);//[10] [20] [30]
        fila.ShowQueue();
        System.out.println("\n");
        fila.Dequeue();      //[  ] [20] [30]
        fila.Dequeue();      //[  ] [  ] [30]
        fila.ShowQueue();
        System.out.println("\n");
        System.out.println(fila.getTamanho() +" Elementos"); // 1 elemento

    }
}
