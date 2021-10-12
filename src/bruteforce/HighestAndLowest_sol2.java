package bruteforce;

import java.util.Arrays;

public class HighestAndLowest_sol2 {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 -3 4 -5"));
    }

    public static String highAndLow(String numbers) {

        String[] arr = numbers.split(" ");

        int [] intArr = new int[arr.length];

        for(int i= 0;intArr.length>i;i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }

        Integer max = intArr[0];
        Integer min = intArr[0];

        for(int i = 0; i<intArr.length; i++) {
            if(max < intArr[i]) {
                max = intArr[i];
            }
            if(min > intArr[i]) {
                min = intArr[i];
            }
        }

        return max.toString() + " " + min.toString();
    }
}
