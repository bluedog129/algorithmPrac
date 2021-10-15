package Math;

public class MultiplesOf3Or5_sol1 {
    public static void main(String[] args) {
        System.out.println(solution(20));
    }
    public static int solution(int number) {
        int sum = 0;

        while(--number>0) {
            if(number %3 == 0) {
                sum += number;
            }
            else if(number %5 == 0) {
                sum += number;
            }
        }

        return sum;
    }
}
