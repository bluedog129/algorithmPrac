package recursiveFuction;

import java.util.Scanner;

public class Sum_of_Digits_sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digital_root(n));
    }

    private static int digital_root(int n) {
        int sum = 0;
        while(n > 0) {
            sum += n%10;
            n /= 10;
        }

        if(sum <10) return sum;

        return digital_root(sum);
    }
}
