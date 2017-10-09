package com.app.datastructures.stack;

import java.util.Arrays;

public class SimpleStackImpl implements SimpleStack {
    private Object[] stack = new Object[1];
    private int size = 0;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(Object object) {
        if (stack.length == size) {
            stack = Arrays.copyOf(stack, stack.length * 2);
            stack[size++] = object;
        } else {
            stack[size++] = object;
        }
    }

    @Override
    public Object pop() {
        Object res = stack[--size];
        stack[size] = null;

        return res;
    }
}
