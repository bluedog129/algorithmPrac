package modularArithmetic;

import java.util.Scanner;
// 직접 (0 ≤ N ≤ 500)의 N!를 구하면 시간초과가 일어난다.
// 따라서 인수분해 했을 경우 2*5의 경우 0이 생긴다는 것을 고려하고
// 2보다 5의 수가 더 적다는 것을 고려해 5의 배수의 갯수를 탐색.
// 단, 5의 제곱수는 2개로 계산
public class num1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;
        for (int i=5; i<=n; i*=5) {
            ans += n/i;
        }
        System.out.println(ans);
    }
}