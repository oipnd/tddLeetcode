package StackAndQueue;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.*;

/**
 * @Author lanoipd
 * @Date 2019/5/10 14:47
 */
public class QueueImplementedByStacksTest {

    QueueImplementedByStacks queue=new QueueImplementedByStacks();
    @Test
    public void testQueImByStacks() {

        assertTrue(queue.isEmpty());
        assertThatThrownBy(() -> {
            queue.pool();
        }).isInstanceOf(RuntimeException.class).hasMessageContaining("Queue is empty.");
        queue.add(0);
        queue.add(1);
        assertFalse(queue.isEmpty());
        queue.add(2);
        assertEquals(0,queue.peek() );
        assertEquals(0,queue.pool() );
        assertEquals(1,queue.pool() );
        assertEquals(2,queue.peek() );
        assertEquals(2,queue.pool() );
        assertTrue(queue.isEmpty());
        assertThatThrownBy(() -> {
            queue.pool();
        }).isInstanceOf(RuntimeException.class).hasMessageContaining("Queue is empty.");


    }
}