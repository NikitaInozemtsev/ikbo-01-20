package gh;

import java.util.ArrayList;

public class Merge {

    public static void main(String[] args) {
       Student1[] arr = new Student1[3];


        arr[0] = (new Student1("Egor", 45,  234));
        arr[1] = (new Student1("Sergey", 10,  201));
        arr[2] = (new Student1("Georgiy", 38,  227));

       Student1[] arr2 = new Student1[3];

        arr2[0] = (new Student1("Nikita", 65, 254));
        arr2[1] = (new Student1("Valeriy", 78, 223));
        arr2[2] = (new Student1("Oleg", 23, 291));

        Student1[] arr1 = new Student1[6];
        int i = 0;
        for (;i < 3; i++) {
            arr1[i] = arr[i];
        }
        for (int j = 0; j < 3;j++){
            arr1[i++] = arr2[j];
        }

        mergeSort(arr1, 0, arr1.length-1);

        for (int i1 = 0; i1 < 6; i1++) {
            System.out.println(arr1[i1]);
        }

    }

    public static void mergeSort(Student1[] source, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        Student1[] buffer = new Student1[right - left + 1];

        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {

            if (delimiter > right || source[cursor].getPoints() > source[delimiter].getPoints()) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);

    }





}

