package homework_14;

import java.io.Serializable;
import java.util.*;

public class CustomDeque<E> extends AbstractCollection<E>
        implements Deque<E>, Cloneable, Serializable {


    LinkedList<E> list = new LinkedList<>();
    @Override
    public void addFirst(E e) {
        list.addFirst(e);
    }

    @Override
    public void addLast(E e) {
        list.addLast(e);
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    @Override
    public E removeFirst() {
        return list.removeFirst();
    }

    @Override
    public E removeLast() {
        return list.removeLast();
    }

    @Override
    public E pollFirst() {
        if(list.removeFirst() == null)
            throw new NoSuchElementException();
        else{
            return list.removeFirst();
        }
    }

    @Override
    public E pollLast() {
        if(list.removeLast() == null)
            throw new NoSuchElementException();
        else{
            return list.removeLast();
        }
    }

    @Override
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        addLast(e);
        return true;
    }

    @Override
    public E getFirst() {
        return list.getFirst();
    }

    @Override
    public E getLast() {
        return list.getLast();
    }

    @Override
    public E peekFirst() {
        if(list.isEmpty())
            return null;
        else
            return list.getFirst();
    }

    @Override
    public E peekLast() {
        if(list.isEmpty())
            return null;
        else
            return list.getLast();
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return list.removeFirstOccurrence(o);
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return list.removeLastOccurrence(o);
    }

    @Override
    public boolean offer(E e) {
        return offerLast(e);
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
