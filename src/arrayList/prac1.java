package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class prac1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("add(값)");
        System.out.println(numbers);

        numbers.add(1, 50);
        System.out.println("\nadd(인덱스, 값)");
        System.out.println(numbers);
    }
}
