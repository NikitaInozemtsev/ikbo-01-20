package gh;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        MyArrayQueue queue1 = new MyArrayQueue();
        queue1.add(123);
        queue1.add(456);
        queue1.add(789);
        System.out.println("element: " + queue1.element());
        System.out.println(queue1);
        System.out.println("peek: " + queue1.peek());
        System.out.println(queue1);
        System.out.println("poll: " + queue1.poll());
        System.out.println(queue1);
        System.out.println();

        MyLinkedQueue queue2 = new MyLinkedQueue();
        queue2.add(123);
        queue2.add(456);
        queue2.add(789);
        System.out.println("element: " + queue2.element());
        System.out.println(queue2);
        System.out.println("peek: " + queue2.peek());
        System.out.println(queue2);
        System.out.println("poll: " + queue2.poll());
        System.out.println(queue2);
        System.out.println();
    }
}


interface MyQueue<E> {
    E element();
    E poll();
    E peek();
    boolean add(E element);
}

abstract class MyAbstractQueue<E> implements MyQueue<E> {
    protected List<E> queue;

    @Override
    public E element() {
        E element = peek();
        if (element != null)
            return element;
        throw new NoSuchElementException();
    }

    public boolean add(E element) {
        if (add(element))
            return true;
        throw new IllegalStateException("Queue full");
    }

    public E remove() {
        E element = poll();
        if (element != null)
            return element;
        throw new NoSuchElementException();
    }

    public boolean addAll(Collection<? extends E> collection) {
        if (collection == null)
            throw new NullPointerException();
        boolean modified = false;
        for (E element : collection) {
            if (add(element))
                modified = true;
        }
        return modified;
    }

    public abstract int size();

    @Override
    public String toString() {
        return queue.toString();
    }
}

class MyArrayQueue<E> extends MyAbstractQueue<E> {
    public MyArrayQueue() {
        this.queue = new ArrayList<>();
    }

    @Override
    public E poll() {
        if (queue == null)
            return null;
        E element = queue.get(0);
        queue.remove(0);
        return element;
    }

    @Override
    public E peek() {
        if (queue == null)
            return null;
        else
            return queue.get(0);
    }

    @Override
    public boolean add(E element) {
        return queue.add(element);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
class MyLinkedQueue<E> extends MyAbstractQueue<E> {
    public MyLinkedQueue() {
        this.queue = new LinkedList<>();
    }

    @Override
    public E poll() {
        if (queue == null)
            return null;
        E element = queue.get(0);
        queue.remove(0);
        return element;
    }

    @Override
    public E peek() {
        if (queue == null)
            return null;
        else
            return queue.get(0);
    }

    @Override
    public boolean add(E element) {
        return queue.add(element);
    }

    @Override
    public int size() {
        return queue.size();
    }
}



