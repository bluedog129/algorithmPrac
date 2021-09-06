package recursiveFuction;

import java.util.Scanner;

public class ex1 {
    public static void fib(int count, int previous, int current, int n) {
        if(count > n) {
            return;
        }
        System.out.println(current);
        fib(count + 1, current, previous + current, n);
    }

    public static void fib(int n) {
        int count = 1;
        fib(count, 0, 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fib(n);
    }
}