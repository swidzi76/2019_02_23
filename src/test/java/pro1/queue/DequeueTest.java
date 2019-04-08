package pro1.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DequeueTest {
    @Test
    public void shouldIsEmptyDequeue(){
        //given
        Dequeue<Integer> dequeue = new Dequeue<>();
        //when

        //TODO
        boolean result = dequeue.isEmpty();

        //then
        Assertions.assertEquals(true, result);
    }
    @Test
    public void shouldIsPeekDequeue(){
        //given
        Dequeue<Integer> dequeue = new Dequeue<>();
        //when
        dequeue.offerFirst(21);
        dequeue.offerFirst(4);

        //TODO
        Integer result = dequeue.peekFirst();

        //then
        Assertions.assertEquals(4, result.intValue());
    }
    @Test
    public void shouldIsPoolDequeue(){
        //given
        Dequeue<Integer> dequeue = new Dequeue<>();
        //when
        dequeue.offerFirst(21);
        dequeue.offerLast(4);

        //TODO
        Integer result = dequeue.poolFirst();

        //then
        Assertions.assertEquals(21, result.intValue());
    }
    @Test
    public void shouldIsSizeDequeue(){
        //given
        Dequeue<Integer> dequeue = new Dequeue<>();
        //when
        dequeue.offerFirst(21);
        dequeue.offerLast(4);

        //TODO
        int result = dequeue.size();

        //then
        Assertions.assertEquals(2, result);
    }
    @Test
    public void shouldIsContainsDequeue(){
        //given
        Dequeue<Integer> dequeue = new Dequeue<>();
        //when
        dequeue.offerFirst(21);
        dequeue.offerLast(4);

        //TODO
        boolean result = dequeue.contains(4);

        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    public void shouldIsClearDequeue(){
        //given
        Dequeue<Integer> dequeue = new Dequeue<>();
        //when
        dequeue.offerFirst(21);
        dequeue.offerFirst(4);

        //TODO
        dequeue.clear();
        int result = dequeue.size();

        //then
        Assertions.assertEquals(0, result);
    }


}
