package modularArithmetic;

import java.util.Scanner;
// 팩토리얼은 2의 개수가 5의 개수보다 항상 많기 때문에 5만 세어줬지만
// 조합은 어떻게 될 지 모르기 때문에 2와 5 다 세어줘야 한다.
public class num2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long two = 0, five = 0;
        for (long i = 2; i<=n; i*=2) {
            two += n/i;
        }
        for (long i = 2; i<=n; i*=2) {
            two -= (n-m)/i;
        }
        for (long i = 2; i<=n; i*=2) {
            two -= m/i;
        }
        for (long i=5; i<=n; i*=5) {
            five += n/i;
        }
        for (long i=5; i<=n-m; i*=5) {
            five -= (n-m)/i;
        }
        for (long i=5; i<=m; i*=5) {
            five -= m/i;
        }
        // 2의 배수와 5의 배수중 더 적은 쪽을 출력
        System.out.println(Math.min(two,five));
    }
}