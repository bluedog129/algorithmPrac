package recursiveFuction;

import java.util.Scanner;
    //fun(1248)
    //16
    //fun(124876)
    //96
public class recur4 {
    // 입력한 정수의 짝수번째만 곱한다
    public static int fuc(int n) {
        if(n==0) return 1;

        return n%10 * fuc(n/100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fuc(n));
    }
}