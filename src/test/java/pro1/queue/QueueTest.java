package pro1.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueTest {
    @Test
    public void shouldIsEmptyQueue(){
        //given
        Queue<Integer> queue = new Queue<>();
        //when

        //TODO
        boolean result = queue.isEmpty();

        //then
        Assertions.assertEquals(true, result);
    }
    @Test
    public void shouldIsPeekQueue(){
        //given
        Queue<Integer> queue = new Queue<>();
        //when
        queue.offer(21);
        queue.offer(4);

        //TODO
        Integer result = queue.peek();

        //then
        Assertions.assertEquals(21, result.intValue());
    }
    @Test
    public void shouldIsPoolQueue(){
        //given
        Queue<Integer> queue = new Queue<>();
        //when
        queue.offer(21);
        queue.offer(4);

        //TODO
        Integer result = queue.pool();

        //then
        Assertions.assertEquals(21, result.intValue());
    }
    @Test
    public void shouldIsSizeQueue(){
        //given
        Queue<Integer> queue = new Queue<>();
        //when
        queue.offer(21);
        queue.offer(4);

        //TODO
        int result = queue.size();

        //then
        Assertions.assertEquals(2, result);
    }
    @Test
    public void shouldIsContainsQueue(){
        //given
        Queue<Integer> queue = new Queue<>();
        //when
        queue.offer(21);
        queue.offer(4);

        //TODO
        boolean result = queue.contains(4);

        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    public void shouldIsClearQueue(){
        //given
        Queue<Integer> queue = new Queue<>();
        //when
        queue.offer(21);
        queue.offer(4);

        //TODO
        queue.clear();
        int result = queue.size();

        //then
        Assertions.assertEquals(0, result);
    }


}
