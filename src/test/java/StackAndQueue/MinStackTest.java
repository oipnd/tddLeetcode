package StackAndQueue;

import org.assertj.core.api.ThrowableAssert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @Author lanoipd
 * @Date 2019/5/10 13:50
 */
public class MinStackTest {

    MinStack Minstack = new MinStack();

    @Test
    public void TestMinStack() {
        assertTrue(Minstack.isEmpty());
        assertThatThrownBy(() -> {
            Minstack.pop();
        }).isInstanceOf(RuntimeException.class).hasMessageContaining("Stack is empty.");

        assertThatThrownBy(() -> {
            Minstack.getMin();
        }).isInstanceOf(RuntimeException.class).hasMessageContaining("Stack is empty.");
        Minstack.push(0);
        Minstack.push(1);
        assertEquals(0, Minstack.getMin());
        assertEquals(1, Minstack.pop());
        Minstack.push(2);
        assertEquals(0, Minstack.getMin());
        assertEquals(2, Minstack.pop());

    }
}