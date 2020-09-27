package gh;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {
}

interface IWaitList<E> {
    public void add(E element);
    public E remove();
    public boolean contains(E element);
    public boolean containsAll(Collection<E> el);
    public boolean isEmpty();
}

class WaitList<E> implements IWaitList<E>{
    protected ConcurrentLinkedQueue<E> a = new ConcurrentLinkedQueue<>();

    public WaitList() {}

    public WaitList(Collection<E> el) {
        a.addAll(el);
    }

    @Override
    public void add(E element) {
        a.add(element);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "a=" + a +
                '}';
    }

    @Override
    public E remove() {
        return a.poll();
    }

    @Override
    public boolean contains(E element) {
        return a.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> el) {
        return a.containsAll(el);
    }

    @Override
    public boolean isEmpty() {
        return a.isEmpty();
    }
}

class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    private int i = 0;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (i == capacity) {
            System.out.println("Очередь заполнена!");
        }
        else {
            super.add(element);
            i++;
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "a=" + a +
                ", capacity=" + capacity +
                '}';
    }
}

class UnfairWailList<E> extends WaitList<E> {
    public UnfairWailList() {}

    public void remove(E element) {
        a.remove(element);
    }

    public void moveToBack(E element) {
        a.remove(element);
        a.add(element);
    }
}