package patterns.iterator;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(13);
        arr.add(6);
        arr.add(8);
        arr.add(10);

        //паттерн итератор
        java.util.Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
