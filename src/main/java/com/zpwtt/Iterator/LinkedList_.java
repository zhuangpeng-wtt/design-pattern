package com.zpwtt.Iterator;

public class LinkedList_<E> {
    Node head = null;
    Node tail = null;

    private int size = 0;

    public void add(E e) {
        Node<E> node = new Node<>(e);
        node.next = null;

        if (null == head) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    Iterator<E> iterator () {
        return new LinkedListIterator();
    }


    private class Node<T> {
        T e;
        Node next;

        public Node(T e) {
            this.e = e;
        }
    }

    class LinkedListIterator implements Iterator<E> {
        Node<E> curr = head;

        @Override
        public boolean hasNext() {
            return curr == null;
        }

        @Override
        public E next() {
            E c = curr.e;
            curr = curr.next;
            return c;
        }
    }
}


