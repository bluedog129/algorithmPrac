package Math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class onesAndZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i<4; i++) {
            int n = sc.nextInt();
            al.add(n);
        }

        System.out.println(ConvertBinaryArrayToInt(al));
    }
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        int currentValue = 1;

        for(int i = binary.size()-1; i>=0; i--) {
            if(binary.get(i) == 1) {
                result += currentValue;
            }
            currentValue *= 2;
        }

        return result;
    }
}
