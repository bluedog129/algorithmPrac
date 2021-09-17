package modularArithmetic;

import java.util.Scanner;

public class num2089 {
    public static void go(int n) {
        // n이 0일 경우
        if(n==0) {
            return;
        }
        // n이 2로 나누어 떨어질 경우
        if(n%2==0) {
            go(-(n/2));
            System.out.print(0);
        // n이 2로 나누어 떨어지지 않는 경우
        } else {
            //양수
            if (n > 0) {
                go(-(n/2));
            //음수
            } else {
                go((-n+1)/2);
            }
            System.out.print(1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print(0);
        } else {
            go(n);
            System.out.println();
        }
    }
}
