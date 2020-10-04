package gh;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"1", "2", "eru"};
        ArrayList<String> list = new ArrayList<>();

        ArrayToList(arr, list);

        for(String a: list)
            System.out.println(a);
    }

    public static <E> void ArrayToList(E[] a, ArrayList<E> lst) {
        for (E e : a)
            lst.add(e);
    }
}
