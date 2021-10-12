package bruteforce;

import java.util.Arrays;

public class areTheyTheSame {
    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(comp(a, b));
    }
    public static boolean comp(int[] a, int[] b) {
        if(a == null || b == null) {
            return false;
        } else {
            for(int i = 0; i< a.length; i++) {
                a[i] = (int) Math.pow((a[i]),2.0);
            }
            Arrays.sort(a);
            Arrays.sort(b);

            return Arrays.equals(a,b);
        }
    }
}
