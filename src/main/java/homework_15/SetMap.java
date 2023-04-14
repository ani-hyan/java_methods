package homework_15;

import java.util.*;


public class SetMap {
    public static void main(String[] args) {

        SetMap obj = new SetMap();
        //1.
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        s1.add(3);
        s1.add(3);
        s1.add(5);
        s1.add(4);
        s2.add(4);
        s2.add(4);
        s2.add(3);
        HashSet<Integer> common = obj.commonElements(s1,s2);
        Iterator<Integer> iterator = common.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }

        //1B
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("A", 15));
        people.add(new Person("B", 6));
        people.add(new Person("C", 25));
        people.add(new Person("D", 1));

        obj.sortedPeople(people);

        //1C
        HashSet<String> str = new HashSet<>();
        str.add("hello");
        str.add("hi");
        str.add("Hello");
        str.add("bye");
        System.out.println(obj.uniqueSet(str));

        //3A
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("A", 20));
        treeSet.add(new Person("B", 90));
        treeSet.add(new Person("C",  58));
        obj.orderByIncreasingAge3(treeSet);

        //anagram
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "dog");
        hashMap.put(1, "act");
        hashMap.put(2, "mice");
        hashMap.put(3, "god");
        hashMap.put(4, "cat");
        hashMap.put(5, "odg");
        System.out.println(obj.anagramPair(hashMap));
    }

    /**
     * 1A. Takes two HashSets of integers and finds the common
     * elements between them
     * @param s1
     * @param s2
     * @return
     */
    public HashSet<Integer> commonElements(HashSet<Integer> s1, HashSet<Integer> s2){
        HashSet<Integer> s3 = new HashSet<>(s1);
        Iterator<Integer> iterator = s3.iterator();
        while (iterator.hasNext()){
            if(!s2.contains(iterator.next())){
                iterator.remove();
            }
        }
        return s3;
    }

    /**
     * 1B. Print out the objects in order of increasing age
     * @param people
     */
    public void sortedPeople(HashSet<Person> people){
        List<Person> p = new ArrayList<>(people);
        Collections.sort(p, new PersonComparator());

        people = new HashSet<>(p);

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }

    }

    /**
     * 1C. Returns a new HashSet containing only the unique words in the original set, ignoring case
     * @param set
     * @return
     */
    public HashSet<String> uniqueSet(HashSet<String> set){
        HashSet<String> s = new HashSet<>();
        for(String str: set){
            s.add(str.toLowerCase());
        }
        return s;
    }

    /**
     * 2A. Takes in a LinkedHashSet of integers and
     * removes any even numbers from the set
     * @param linkedSet
     * @return
     */
    public LinkedHashSet<Integer> noEvenNumber(LinkedHashSet<Integer> linkedSet){
        Iterator<Integer> iterator = linkedSet.iterator();
        while(iterator.hasNext()){
            if(iterator.next() % 2 == 0){
                iterator.remove();
            }
        }
        return linkedSet;
    }

    /**
     *2B. Create a LinkedHashSet of custom objects with a name and age field.
     * Then, write a comparator to sort the objects by age
     * and print out the objects in order of increasing age
     * @param people
     */
    public void sortedPeopleLinkedSet(LinkedHashSet<Person> people){
        List<Person> p = new ArrayList<>(people);
        Collections.sort(p, new PersonComparator());

        people = new LinkedHashSet<>(p);

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }

    }


    /**
     *  2C. Takes in a LinkedHashSet of custom objects and
     *  removes any objects that have a duplicate name field
     * @param people
     * @return
     */
    public LinkedHashSet<Person> noDuplicateNames(LinkedHashSet<Person> people){
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()){
            if(people.contains(iterator.next())){
                people.remove(iterator.next());
            }
        }
        return people;
    }


    /**
     * 3A. Create a TreeSet of custom objects with a name and age field.
     * Then, write a comparator to sort the objects by age and
     * print out the objects in order of increasing age.
     * @param treeSet
     */
    public void orderByIncreasingAge3(TreeSet<Person> treeSet) {
        ArrayList<Person> arrayList = new ArrayList(treeSet);
        Collections.sort(arrayList);
        for (Object o : arrayList) {
            System.out.println(o + " ");
        }
    }

    /**
     *3B. Takes in two TreeSets of integers and returns a new set
     * containing only the elements that are in the first set
     * but not in the second set.
     * @param tree1
     * @param tree2
     * @return
     */
    public static TreeSet<Integer> difference(TreeSet<Integer> tree1, TreeSet<Integer> tree2) {
        TreeSet<Integer> newest = new TreeSet<>();
        for (Integer element : tree1) {
            if (!tree2.contains(element)) {
                newest.add(element);
            }
        }
        return newest;
    }

    /**
     * 3C. Takes in a TreeSet of strings and returns a new set
     * containing only the unique words in the original set,
     * ignoring case.
     * @param tree
     * @return
     */
    public TreeSet<String> uniqueTree(TreeSet<String> tree){
        TreeSet<String> s = new TreeSet<>();
        for(String str: tree){
            s.add(str.toLowerCase());
        }
        return s;
    }

    public int anagramPair(HashMap<Integer, String> hashMap) {
        int temp1 = 0;
        int temp2 = 0;
        int counter = 0;
        for (int i = 0; i < hashMap.size() - 1; i++) {
            for (int k = 0; k < hashMap.get(i).length(); k++) {
                temp1 += hashMap.get(i).charAt(k);
            }
            for (int j = i + 1; j < hashMap.size(); j++) {
                for (int k = 0; k < hashMap.get(j).length(); k++) {
                    temp2 += hashMap.get(j).charAt(k);
                }
                if (temp1 == temp2){
                    counter++;
                }
                temp2 = 0;
            }
            temp1 = 0;
        }
        return  counter;
    }



}
