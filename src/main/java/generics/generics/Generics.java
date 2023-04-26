package homework_15.generics;

import java.util.ArrayList;

public class Generics {
    /**
     * 1. Generic method that exchanges the positions of two different elements in an
     * array
     * @param array
     * @param element1
     * @param element2
     * @param <E>
     */
    public <E> void swap(ArrayList<E> array, E element1, E element2){
        if(array.contains(element1) && array.contains(element2)){
            E temp = element1;
            element1 = element2;
            element2 = temp;
        }
    }

    /**
     * 2.
     * public final class Algorithm {
     * public static <T> T max(T x, T y) {
     *         return x > y ? x : y;
     *         }
     * }
     * to perform comparison the type must be comparable
     */


    /**
     * 3. TODO
     */


}
