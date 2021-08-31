package deque.deque2;

import deque.deque1.Deque1;

public class Main {

        public static void main(String[] args) {
            Deque2 deque = new Deque2();

            try {
                deque.DequeueInicio();
                deque.DequeueFim();

                deque.Enqueue(10);
                deque.Enqueue(20);
                deque.Enqueue(30);
                deque.Enqueue(40);
                deque.Enqueue(50);

                deque.ShowQueue();
                deque.Enqueue(60);
                System.out.println("Tamanho da fila " + deque.getTamanho());

                deque.DequeueInicio();
                deque.DequeueFim();
                deque.Enqueue(80);
                deque.ShowQueue();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }


