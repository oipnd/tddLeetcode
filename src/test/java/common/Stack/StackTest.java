package common.Stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author lanoipd
 * @Date 2019/5/10 13:03
 */
public class StackTest {
    Stack<Integer> stack = new Stack<Integer>();


    @Test
    public void testStack() {
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());
        assertEquals(Integer.valueOf(1), stack.peek());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertTrue(stack.isEmpty());
        stack.push(1);
        stack.push(2);
        assertEquals(Integer.valueOf(2), stack.peek());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertTrue(stack.isEmpty());

    }
}