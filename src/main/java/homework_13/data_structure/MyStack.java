package homework_13.data_structure;

import java.util.ArrayList;

public class MyStack<T>{
    private ArrayList<T> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Adds an element to the top of the stack
     * @param e
     */
    public void push(T e){
        list.add(0, e);
    }

    /**
     * Removes the topmost element from the stack
     * @return
     */
    public T pop() {
        return list.remove(0);
    }

}
