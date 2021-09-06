package recursiveFuction;

import java.util.Scanner;

public class recur3 {
    //factorial(3)  6
    //fac(4) 24
    public static int fac(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return n * fac(n-1);
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       System.out.println(fac(n));
    }
}
