package gh;

import java.util.Arrays;

public class Task2_3 {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 6, 12, 32, 7};
        Test<Integer> a = new Test<Integer>(arr1);
        System.out.println(a);
        System.out.println(a.getElement(3));
    }

}

class Test <E> {
    E[] arr;

    Test(E[] arr) {
        this.arr = arr;
    }

    public E getElement(int index) {
        return arr[index];
    }

    @Override
    public String toString() {
        return "Test{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
