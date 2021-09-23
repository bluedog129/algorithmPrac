package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class prac2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("add(값)");
        System.out.println(numbers);

        System.out.println("\nindexOf()");
        System.out.println(numbers.indexOf(30));
        System.out.println();

        Iterator it = numbers.iterator();

        while(it.hasNext()) {
            int value = (int)it.next();
            if (value == 30) {
                it.remove();
            }
            System.out.println(value);
        }
        System.out.println(numbers);
        System.out.println();

        for(int value : numbers) {
            System.out.println(value);
        }
    }
}
