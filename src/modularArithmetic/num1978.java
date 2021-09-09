package modularArithmetic;

import java.util.Scanner;

public class num1978 {
    public static boolean prime(int n) {
        // 1. 입력된 값 n 이 n<=1이면 소수 x
        if(n <= 1) {
            return false;
            // 2. n == 2 이면 소수 o
        } else if (n == 2) {
            return true;
        }
        // 3. (i <= n-1) 조건 안에서 n % i == 0을 만족하면 소수 x
        // 시간복잡도를 줄이기 위해서 (루트n) >= i로 조건을 바꾸어주었다.
        for (int i =2; i*i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        // 4. 위의 for문 조건에 걸리지 않으면 소수이다.
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n-- > 0) {
            if (prime(sc.nextInt())) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
