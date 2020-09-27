package gh;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<String>();

        l.add("Германия");
        l.add("Франция");
        l.addLast("Великобритания");

        l.addFirst("Испания");
        l.add(1, "Италия");
        System.out.println("В списке " + l.size() + " элементов \n");
        System.out.println(l.get(1));
        l.set(1, "Дания");
        for(String state : l){
            System.out.println(state);
        }

        if(l.contains("Германия")){
            System.out.println("Список содержит государство Германия");
        }
        l.remove("Германия");
        l.removeFirst();
        l.removeLast();

    }
}
