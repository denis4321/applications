package com.app.datastructures;

import com.app.datastructures.queue.SimpleQueue;
import com.app.datastructures.queue.SimpleQueueImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimpleQueueTest {
    @Test
    public void isEmptyTest() {
        SimpleQueue queue = new SimpleQueueImpl();
        String item1 = "item 1";

        assertTrue(queue.isEmpty());

        queue.enqueue(item1);

        assertFalse(queue.isEmpty());
    }

    @Test
    public void sizeTest() {
        SimpleQueue queue = new SimpleQueueImpl();
        String item1 = "item 1";

        assertEquals(0, queue.size());

        queue.enqueue(item1);

        assertEquals(1, queue.size());
    }

    @Test
    public void pushTest() {
        SimpleQueue queue = new SimpleQueueImpl();
        String item1 = "item 1";
        String item2 = "item 2";

        queue.enqueue(item1);
        queue.enqueue(item2);

        assertEquals(2, queue.size());
    }

    @Test
    public void popTest() {
        SimpleQueue queue = new SimpleQueueImpl();
        String item1 = "item 1";
        String item2 = "item 2";
        String item3 = "item 3";

        queue.enqueue(item1);
        queue.enqueue(item2);

        assertEquals("item 1", queue.dequeue());

        queue.enqueue(item3);

        assertEquals("item 2", queue.dequeue());
        assertEquals("item 3", queue.dequeue());
    }
}
