package modularArithmetic;

import java.util.Scanner;

public class num17087 {
    static int gcd(int x, int y) {
        if (y == 0) return x;
        else return gcd(y, x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] a = new int[n];

        for (int i =0; i<n; i++) {
            int x = sc.nextInt();
            // 수빈이와 각 동생들과의 거리
            int diff = Math.abs(x-s);
            a[i] = diff;
        }
        int ans = a[0];
        // X+D또는 X-D로만 이동하려면 Y-X가 D의 배수가 되어야 하고,
        // Z-X가 D의 배수가 되어야 한다.
        // 따라서 각 거리들의 최대 공약수를 구해야 한다.
        for (int i=1; i<n; i++) {
            ans = gcd(ans, a[i]);
        }
        System.out.println(ans);
    }
}
