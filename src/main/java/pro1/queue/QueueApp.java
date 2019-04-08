package pro1.queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        int max = 20;
        System.out.println(" dodajemy od 1 do "+max);
        for (int i = 1; i <= max ; i++) {
            System.out.println(i);
            queue.offer(i);
        }

        System.out.println(" peek : "+ queue.peek());
        System.out.println(" size : "+ queue.size());
        System.out.println(" is empty : "+ queue.isEmpty());
        System.out.println(" metada clear ");
        queue.clear();
        System.out.println(" size : "+ queue.size());
        System.out.println(" is empty : "+ queue.isEmpty());

        System.out.println(" dodajemy od 1 do "+max);
        for (int i = 1; i <= max ; i++) {
            queue.offer(i);
        }
        System.out.println(" czy jest 3 :"+queue.contains(3));
        System.out.println(" czy jest -2 :"+queue.contains(-2));

        System.out.println(" wyjmujemy el. z kolejki");
        while(!queue.isEmpty()){
            System.out.println(queue.pool());
        }
        System.out.println(" ------ test kolejki dwu kierunkowej");
        Dequeue<Integer> dequeue = new Dequeue<>();
        dequeue.offerFirst(21);
        dequeue.offerFirst(34);
        dequeue.offerLast(12);
        System.out.println(" size = "+ dequeue.size());
        System.out.println(" peekFirst : "+ dequeue.peekFirst());
        System.out.println(" peekLast : "+ dequeue.peekLast());
        System.out.println(" isEmpty : "+ dequeue.isEmpty());
        System.out.println(" poolFirst : "+ dequeue.poolFirst());
        System.out.println(" poolLast : "+ dequeue.poolLast());
        System.out.println(" size = "+ dequeue.size());
        System.out.println(" peekFirst : "+ dequeue.peekFirst());
        System.out.println(" peekLast : "+ dequeue.peekLast());
        System.out.println(" offerLast 33: "); dequeue.offerLast(33);
        System.out.println(" peekLast : "+ dequeue.peekLast());
        System.out.println(" poolFirst : " + dequeue.poolFirst());
        System.out.println(" poolFirst : " + dequeue.poolFirst());
        System.out.println(" poolFirst : " + dequeue.poolFirst());
        System.out.println(" size = "+ dequeue.size());
        System.out.println(" isEmpty : "+ dequeue.isEmpty());

        System.out.println(" dodanie do kolejki 4 elemrntów");
        dequeue.offerFirst(21);
        dequeue.offerFirst(2);
        dequeue.offerFirst(231);
        dequeue.offerFirst(212);
        System.out.println(" czy zawiera 2 " + dequeue.contains(2));
        System.out.println(" czy zawiera 5 " + dequeue.contains(5));
        System.out.println(" clear");dequeue.clear();
        System.out.println(" size = "+ dequeue.size());
        System.out.println(" isEmpty : "+ dequeue.isEmpty());

    }
}
