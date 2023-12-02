package Lists;

//resize feature

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//List Interface
//List<E> extends Collections<E> externs Iterable<T>
//Implementing classes
// ArrayList<E> -> AbstractList<E> -> List<E>
// Stack<E> -> Vector<E> -> AbstractList<E>
// LinkedList<E> -> List<E>
// CopyOnWriteArrayList<E> -> List<E>
public class JList {

    //int size();
    //boolean isEmpty;
    //boolean contains(Object o);
    //Iterator<E> iterator();
    //Object[] toArray();
    //boolean add(E e)
    //boolean remove(Object o)
    //boolean retainAll(Collection<?> c)
    //void clear(): Removes all the elements form the list
    //E get(int index)
    //E set(int index, E element)
    //ListIterator<E> listIterator() //returns a list iterator over the elements
    //List<E> subList(int fromIndex, int toIndex)

    // default void replaceAll(UnaryOperator<E> operator) //replaces each element with the result of applying the operator
    //default void sort(Comparator<super E> c)
    //default Spliterator<E> spliterator()

    //Array to List
    public static void main(String[] args) {
        String[] vowels = {"a", "b", "c"};

        //Backed by array so can't do structural mod
        List<String> vowelList = Arrays.asList(vowels);
        System.out.println(vowelList);
        System.out.println(vowels);

        //can be modified
        List<String> myList = new ArrayList<>();
        for (String s : vowels) {
            myList.add(s);
        }
        System.out.println(myList);

        List<String> items = List.of(vowels);
        ArrayList<String> aList = new ArrayList<>(items);
        aList.add("D");

        var gArray = aList.toArray(new String[aList.size()]);
    }
}
