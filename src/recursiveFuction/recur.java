package recursiveFuction;

import java.util.Scanner;

public class recur {
    //sum(7)  7
    //sum(123) 6
    //sum(258) 15
    public static int sum(int n, int d) {
        if(n==0) {
            return 0;
        }
        return n%d + sum((n-n%d)/10, d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 10;

        sum(n, d);
        System.out.println(sum(n, d));
    }
}
