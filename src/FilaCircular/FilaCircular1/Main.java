package FilaCircular.FilaCircular1;



public class Main {
    public static void main(String[] args) {
        FilaCircular1 filac = new FilaCircular1();

        filac.Enqueue(10);
        filac.Enqueue(20);
        filac.Enqueue(30);
        filac.Enqueue(40);
        filac.Enqueue(50);
        filac.ShowQueue();
        filac.Dequeue();

        filac.ShowQueue();

        filac.Enqueue(60);
        filac.ShowQueue();
        filac.Enqueue(70);
        filac.Enqueue(80);
        filac.ShowQueue();



    }
}

