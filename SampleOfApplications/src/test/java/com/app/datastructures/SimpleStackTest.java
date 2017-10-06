package com.app.datastructures;

import com.app.datastructures.stack.SimpleStack;
import com.app.datastructures.stack.SimpleStackImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimpleStackTest {
    @Test
    public void isEmptyTest() {
        SimpleStack stack = new SimpleStackImpl();
        String item1 = "item 1";

        assertTrue(stack.isEmpty());

        stack.push(item1);

        assertFalse(stack.isEmpty());
    }

    @Test
    public void sizeTest() {
        SimpleStack stack = new SimpleStackImpl();
        String item1 = "item 1";

        assertEquals(0, stack.size());

        stack.push(item1);

        assertEquals(1, stack.size());
    }

    @Test
    public void pushTest() {
        SimpleStack stack = new SimpleStackImpl();
        String item1 = "item 1";
        String item2 = "item 2";

        stack.push(item1);
        stack.push(item2);

        assertEquals(2, stack.size());
    }

    @Test
    public void popTest() {
        SimpleStack stack = new SimpleStackImpl();
        String item1 = "item 1";
        String item2 = "item 2";
        String item3 = "item 3";

        stack.push(item1);
        stack.push(item2);

        assertEquals("item 2", stack.pop());

        stack.push(item3);

        assertEquals("item 3", stack.pop());
        assertEquals("item 1", stack.pop());
    }
}
