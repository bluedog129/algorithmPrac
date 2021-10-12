package bruteforce;

import java.util.Arrays;

public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 -3 4 -5"));
    }
    public static String highAndLow(String numbers) {
        String[] arr = numbers.split(" ");

        int [] intArr = new int[arr.length];

        for(int i= 0;intArr.length>i;i++){
            intArr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(intArr);

        return Integer.toString(intArr[intArr.length-1]) + " " + Integer.toString(intArr[0]);
    }
}
