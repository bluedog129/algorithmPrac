package Math;

public class MultiplesOf3Or5_sol2 {
    public static void main(String[] args) {
        System.out.println(solution(20));
    }
    public static int solution(int number) {
        int sum = 0;

        for(int i = 0; i<number; i++) {
            sum += (i%3 == 0 || i%5 == 0) ? i:0;
        }

        return sum;
    }
}
