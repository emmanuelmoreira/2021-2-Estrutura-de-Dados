package deque.deque1;

public class Main {
    public static void main(String[] args) {
        Deque1 deque = new Deque1();
        deque.DequeueInicio();

        deque.Enqueue(10);
        deque.Enqueue(20);
        deque.Enqueue(30);
        deque.Enqueue(40);

        deque.ShowQueue();
        System.out.println(deque.getTamanho());



    }
}
