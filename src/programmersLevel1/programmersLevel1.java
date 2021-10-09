package programmersLevel1;

import java.util.Arrays;

public class programmersLevel1 {
    public static void main(String[] args) {
        long n = 12345;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(long n) {
        int[] answer = new int[5];
        int temp = (int) n;

        int i = 0;
        while(temp>0) {


            answer[i] = temp%10;
            temp /= 10;

            i++;
        }

        return answer;
    }
}
