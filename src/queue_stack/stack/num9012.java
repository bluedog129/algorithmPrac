package queue_stack.stack;

import java.util.Scanner;

public class num9012 {

    public static String vps(String s) {
        int n = s.length();
        int cnt = 0;
        for (int i=0; i<n; i++) {
            if(s.charAt(i) == '(') {
                cnt += 1;
            } else {
                cnt -= 1;
            }
            if(cnt < 0) {
                return "NO";
            }
        }
        if (cnt == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            System.out.println(vps(sc.next()));
        }
    }
}
