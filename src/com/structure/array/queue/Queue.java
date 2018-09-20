package com.structure.array.queue;

/**
 * @author pp-sir
 * @date 2018/9/19 17:24
 */
public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();

}
