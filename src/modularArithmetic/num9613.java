package modularArithmetic;

import java.util.Scanner;

public class num9613 {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int[] m = new int[n];
            for(int i = 0; i<n; i++) {
                m[i] = sc.nextInt();
            }
            long ans = 0;
            //
            for (int i = 0; i<n-1; i++) {
                for (int j=i-1; j<n; j++) {
                    ans += gcd(m[i], m[j]);
                }
            }
            System.out.println(ans);
        }
    }
}