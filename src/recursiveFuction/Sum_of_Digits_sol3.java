package recursiveFuction;

import java.util.Scanner;

public class Sum_of_Digits_sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digital_root(n));
    }

    private static int digital_root(int n) {
        if(n<10) {
            return n;
        }
        return n %10 + digital_root(n/10);
    }
}
