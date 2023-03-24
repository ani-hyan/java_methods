package homework_13.data_structure;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomArrayList<E> implements List<E> {
    private int size;
    private E[] arr;

    public CustomArrayList() {
        arr = (E[]) new Object[10];
    }

    public CustomArrayList(int capacity) {
        arr = (E[]) new Object[capacity];
    }

    /**
     * Appends the specified element to the end of this list.
     */
    @Override
    public boolean add(E e) {
        if(arr.length == size)
            arr = grow();
        arr[size] = e;
        size++;
        return true;
    }

    private E[] grow() {
        Object[] newest = new Object[size * 2];
        for (int i = 0; i < size; i++) {
            newest[i] = arr[i];
        }
        arr = (E[]) newest;
        return arr;
    }

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.  If the list does not contain the element, it is
     * unchanged.
     * @param o element to be removed from this list, if present
     * @return
     */
    @Override
    public boolean remove(Object o) {
        for(int i = 0; i < size; i++){
            if(arr[i].equals(o)){
                while(i < size-1){
                    arr[i] = arr[i+1];
                    i++;
                }
                size--;
                return true;
            }
        }
        return false;
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
     * Returns {@code true} if this list contains the specified element.
     *
     * @param o element whose presence in this list is to be tested
     * @return {@code true} if this list contains the specified element
     */
    @Override
    public boolean contains(Object o) {
        for(int i = 0; i<size; i++){
            if(arr[i].equals(o))
                return true;
        }
        return false;
    }


    /**
     * Removes all of the elements from this list.  The list will
     * be empty after this call returns.
     */
    @Override
    public void clear() {
        E[] empty = (E[]) new Object[0];
        arr = empty;
        size = 0;
    }

    /**
     * Returns the element at the specified position in this list.
     *
     * @param  index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        if(index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        else
            return arr[index];
    }

    /**
     * Replaces the element at the specified position in this list with
     * the specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    @Override
    public E set(int index, E element) throws IndexOutOfBoundsException{
        if(index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        E old = arr[index];
        arr[index] = element;
        return old;
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