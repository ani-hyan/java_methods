package homework_13.data_structure;

import java.util.*;

public class CustomLinkedList<E> implements List<E> {
    private class Node<E>{
        private Node<E> next;
        private Node<E> previous;
        private E element;

        Node(Node<E> prev, E element, Node<E> next) {
            this.element = element;
            this.next = next;
            this.previous = prev;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public E getElement() {
            return element;
        }
    }

    private Node<E> first;
    private Node<E> last;
    private int size;

    public CustomLinkedList(){
        first = new Node<>(null, null, null);
        last = new Node<>(null, null, null);
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Appends the specified element to the end of this list.
     * @param e element whose presence in this collection is to be ensured
     * @return
     */
    @Override
    public boolean add(E e) {
        Node<E> newest;
        if(isEmpty()){
            newest = new Node<>(null, e, null);
            first = newest;
        }
        else {
            newest = new Node<>(last, e, null);
            last.setNext(newest);
        }
        last = newest;
        size++;
        return true;
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    @Override
    public E get(int index) {
        if(index > size || index < 0)
            throw new IndexOutOfBoundsException();
        Node<E> current = first;
        int i = 0;
        while(i < size && current.next != null){
            current = current.getNext();
        }
        return current.getElement();
    }

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.
     * @param o element to be removed from this list, if present
     * @return
     */
    @Override
    public boolean remove(Object o) {
        if(first == last && first.getElement().equals(o)) {
            first = last = null;
            size--;
            return true;
        }
        Node<E> current = first;
        for(int i = 0; i < size; i++){
            if(current.getElement().equals(o)){
                current.previous.setNext(current.next);
                current.next.setPrevious(current.previous);
                current.setPrevious(null);
                current.setNext(null);
                size--;
                return true;
            }
        }
        return false;
    }

    /**
     * Replaces the element at the specified position in this list with
     * the specified element.
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return
     */
    @Override
    public E set(int index, E element) {
       if(index >= size || index < 0)
           throw new IndexOutOfBoundsException();
       Node<E> current = first;
       for(int i = 0; i < size-1; i++){
           current = current.next;
       }
       E old = current.getElement();
       current.setElement(element);
       return old;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
