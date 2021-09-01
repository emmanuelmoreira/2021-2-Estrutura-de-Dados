package FilaCircular.FilaCircular2;
public class Main {
    public static void main(String[] args) {

        FilaCircular2 filac = new FilaCircular2();

        filac.Enqueue(10);
        filac.Enqueue(20);
        filac.Enqueue(30);
        filac.Enqueue(40);
        filac.Enqueue(50);
        filac.FilaCircularDequeue();
        filac.Enqueue(60);
        filac.ShowQueue();

        filac.FilaCircularDequeue();
        filac.FilaCircularDequeue();
        filac.Enqueue(70);
        filac.Enqueue(80);
        filac.ShowQueue();




    }
}

