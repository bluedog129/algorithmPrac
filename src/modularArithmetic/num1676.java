package modularArithmetic;

import java.util.Scanner;

public class num1676 {
    public static int fac(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1;

        return n * fac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int m = 1;

        while(true) {
            if(fac(n)%Math.pow(10,m) == 0) {
                cnt++;
            } else {
                break;
            }
            m++;
        }
        System.out.println(cnt);
    }
}
