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
    }
}
