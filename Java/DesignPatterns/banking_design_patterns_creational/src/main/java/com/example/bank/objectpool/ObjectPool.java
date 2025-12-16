package com.example.bank.objectpool;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.function.Supplier;

public class ObjectPool<T> {
    private final Deque<T> pool = new ArrayDeque<>();
    private final Supplier<T> creator;

    public ObjectPool(int initialSize, Supplier<T> creator) {
        this.creator = creator;
        for (int i = 0; i < initialSize; i++) pool.push(creator.get());
    }

    public synchronized T acquire() {
        return pool.isEmpty() ? creator.get() : pool.pop();
    }

    public synchronized void release(T obj) { pool.push(obj); }
}
