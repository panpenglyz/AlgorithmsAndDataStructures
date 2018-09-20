package com.structure.array.array;

/**
 * @author pp-sir
 * @date 2018/9/19 15:09
 */
public interface Stack<E> {

    void push(E e);

    E pop();

    E peek();

    int getSize();

    boolean isEmpty();

}
