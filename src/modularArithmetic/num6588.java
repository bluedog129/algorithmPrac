package modularArithmetic;

import java.util.ArrayList;
import java.util.Scanner;

public class num6588 {
    public static final int MAX = 1000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[MAX+1];
        ArrayList<Integer> prime = new ArrayList<Integer>();

        check[0] = check[1] = true; // 0,1 은 소수가 아님

        for (int i=2; i*i <= MAX; i++) {
            if (check[i] == true) {
                continue;
            }
            // ArrayList에 false 인덱스만큼 추가
            prime.add(i);
            // 소수의 배수들을 제거
            for (int j = i+i; j<=MAX; j+=i) {
                check[j] = true;
            }
        }
        // 임의의 짝수 정수 n을 입력하고
        // check[n-p] = false 를 for문으로 탐색하여 찾아낸다.
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            for (int i=1; i<prime.size(); i++) {
                int p = prime.get(i);
                if (check[n-p] == false) {
                    System.out.println(n + " = " + p + " + " + (n-p));
                    break;
                }
            }
        }
    }
}
