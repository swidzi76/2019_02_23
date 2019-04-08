package pro1.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    public void shouldIsEmptyStack(){
        //given
        Stack<Integer> stack = new Stack();
        //when

        //TODO
        boolean result = stack.isEmpty();

        //then
        Assertions.assertEquals(true, result);
    }

    @Test
    public void shouldPushAndPopStack(){
        //given
        Stack<Integer> stack = new Stack();
        //when
        stack.push(23);
        stack.push(42);

        //TODO
        Integer result = stack.pop();

        //then
        Assertions.assertEquals(42, result.intValue());
    }
    @Test
    public void shouldPeekStack(){
        //given
        Stack<Integer> stack = new Stack();
        //when
        stack.push(23);
        stack.push(42);

        //TODO
        Integer result = stack.peek();

        //then
        Assertions.assertEquals(42, result.intValue());
    }
    @Test
    public void shouldSizeStack(){
        //given
        Stack<Integer> stack = new Stack();
        //when
        stack.push(23);
        stack.push(42);

        //TODO
        int result = stack.size();

        //then
        Assertions.assertEquals(2, result);
    }

}
