package programmersLevel1;

import java.util.Arrays;
import java.util.Scanner;

public class arithmeticSquence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(Arrays.toString(solution(x,n)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for(int i = 1; i<n; i++) {
            // 등차수열
            answer[i] = answer[i-1]+x;
        }

        return answer;
    }
}
