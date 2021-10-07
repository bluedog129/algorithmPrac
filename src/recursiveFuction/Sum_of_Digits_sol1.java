package recursiveFuction;

import java.util.Scanner;

public class Sum_of_Digits_sol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(digital_root(n));
    }
    public static int digital_root(int n) {
        String s = String.valueOf(n);
        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(s.substring(i,i+1));
        }

        if(sum < 10) return sum;

        return digital_root(sum);
    }
}
