package bit;

import java.util.Scanner;

public class bitCounting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(bitCount(n));
    }

    public static int bitCount(int n) {
        int bit = 0;

        while(n >0) {
            bit += n%2;
            n /= 2;
        }

        return bit;
    }
}
