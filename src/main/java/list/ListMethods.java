package homework_13;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> j = new LinkedList<>();
    }
     /**
     * 1. Iterates through all elements in the array list.
     *
     * @param list
     */
    public void iterate(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /**
     * 2. Insert an element into the array list at the first position
     *
     * @param list
     * @param element
     */
    public void insertAtFirst(ArrayList list, Object element) {
        list.add(0, element);
    }

    /**
     * 3. Updates specific array element by given element
     *
     * @param list
     * @param old
     * @param newest
     */
    public void update(ArrayList list, Object old, Object newest) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(old)) {
                list.set(i, newest);
            }
        }
    }

    /**
     * 4. Searches an element in the array list
     *
     * @param list
     * @param element
     * @return index of the element
     */
    public int search(ArrayList list, Object element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element))
                return i;
        }
        return -1;
    }

    /**
     * 5. Copies one array list into another
     *
     * @param list
     * @return new ArrayList
     */
    public ArrayList copy(ArrayList list) {
        ArrayList newest = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            newest.add(i, list.get(i));
        }
        return newest;
    }

    /**
     * 6. Reverses elements in the array list.
     *
     * @param list
     * @return reversed List
     */
    public ArrayList reverse(ArrayList list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            Object temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
        return list;
    }

    /**
     * 7. Swaps two elements in an array list
     *
     * @param list
     * @param o1
     * @param o2
     */
    public void swap(ArrayList list, Object o1, Object o2) {
        if (!list.contains(o1) || !list.contains(o2))
            return;
        Object temp = o1;
        list.set(list.indexOf(o1), o2);
        list.set(list.indexOf(o2), temp);
    }

    /**
     * 8. Tests an array list is empty or not.
     *
     * @param list
     * @return whether the array list is empty or not
     */
    public boolean isEmpty(ArrayList list) {
        return list.size() == 0;
    }

    /**
     *9. Increases the size of an array list.
     */
    public ArrayList grow(ArrayList list) {
        ArrayList large = new ArrayList(list.size() + 10);
        for (int i = 0; i < list.size(); i++) {
            large.set(i, list.get(i));
        }
        list = large;

        return list;
    }

    /**
     * 10. Iterates through all elements in the Linked list.
     *
     * @param list
     */
    public void iterate(LinkedList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /**
     * 11. Iterates a linked list in reverse order.
     * @param list
     */
    public void reverseIterate(LinkedList list){
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }

    /**
     * 12. Inserts elements into the linked list at the first and last position.
     * @param list
     * @param first
     * @param last
     */
    public void insertFirstLast(LinkedList list, Object first, Object last){
        list.add(0, first);
        list.add(list.size() - 1, last);
    }

    /**
     * 13. Inserts the
     * specified element at the end of a linked list
     * @param list
     * @param last
     */
    public void insertLast(LinkedList list, Object last){
        list.set(list.size() - 1, last);
    }

    /**
     * 14. Removes first
     * and last element from a linked list.
     * @param list
     */
    public void removeFirstLast(LinkedList list){
        list.removeFirst();
        list.removeLast();
    }

    /**
     * 15. Clones the
     * linked list to another linked list.
     * @param list
     * @return new LinkedList
     */
    public LinkedList clone(LinkedList list){
        LinkedList newest = new LinkedList();
        for(int i = 0; i < list.size(); i++){
            newest.set(i, list.get(i));
        }

        return newest;
    }

    /**
     * 16. Tests the linked list is empty or not.
     * @param list
     * @return whether the linked list is empty or not
     */
    public boolean isEmpty(LinkedList list) {
        return list.size() == 0;
    }

    /**
     * 17. Calculates and prints the sum and average of the elements of the  sequence
     */
    public void sumAverage(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        String current = sc.nextLine();
        int sum = 0;
        while(current.length() != 0){
            list.add(Integer.valueOf(current));
            sum += Integer.valueOf(current);
            current = sc.nextLine();
        }
        System.out.println("Sum: " + sum + "\nAverage: " + ((double)sum)/list.size());
    }

    /**
     * 18. Sorts the list in an increasing order
     */
    public void sort(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        String current = sc.nextLine();
        while(current.length() != 0){
            list.add(Integer.valueOf(current));
            current = sc.nextLine();
        }
        Collections.sort(list);
    }

    /**
     * 19. Removes from
     * given sequence  all negative numbers
     * @param list
     */
    public void removeNegative(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < 0)
                list.remove(i);
        }
    }

    /**
     * 20. Removes from given
     * sequence  all numbers that occur odd number of times.
     * @param list
     * @return
     */
    private ArrayList<Integer> findDuplicates(ArrayList list){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; i < list.size()-1; i++){
            int count = 0;
            for(int j = i+1; j < list.size(); j++){
                if(list.get(j).equals(list.get(i)))
                    count++;
            }
            if(count % 2 != 0 && !temp.contains(list.get(i))){
                temp.add((Integer) list.get(i));
            }
        }
        return temp;
    }
    public ArrayList removeOddOccurrences(ArrayList list){
        ArrayList<Integer> temp = findDuplicates(list);
        for(int i = 0; i < temp.size(); i++)
            list.removeAll(Collections.singleton(list.get(i)));
        return list;
    }


    /**
     * 22. Replaces every occurrence in an ArrayList<T> of a specified
     * item with a specified replacement item
     * @param list
     * @param old
     * @param newest
     * @param <T>
     */
    public <T> void replace(ArrayList<T> list, T old, T newest){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(old)){
                list.set(i, newest);
            }
        }
    }




}
