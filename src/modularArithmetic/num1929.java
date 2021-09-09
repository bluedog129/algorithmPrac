package modularArithmetic;

import java.util.Scanner;

public class num1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // true : 소수 X
        // false : 소수 O
        boolean[] check = new boolean[m+1]; // 소수가 아니어서 지우게 되면 true;
        check[0] = check[1] = true; // 0, 1은 소수가 아니므로 true;

        for(int i=2; i*i <= m; i++) {
            // 소수가 아니면 continue;
            if (check[i] == true) {
                continue;
            }
            // 모든 배수를 지운다.
            for (int j=i+i; j<=m; j+=i) {
                check[j] = true;
            }
        }
        // n이상 m이하의 소수 출력
        for (int i =n; i<=m; i++) {
            if(check[i] == false) {
                System.out.println(i);
            }
        }
    }
}