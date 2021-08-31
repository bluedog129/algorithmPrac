import java.util.*;

public class recur2 {
    //short(aba) b
    //short(abcba) c
    //short(abccba)
    //short(acbbba) cbbb
    //short(abcabf) abcabf

    public static String fuc(String input , int start , int end) {
        if(start == end || start > end) {
            return input.substring(start,end+1);
        }
        if (input.charAt(start) != input.charAt(end)) {
            return input.substring(start,end+1);
        }

        return fuc(input, start+1, end-1);
    }

    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        end = input.length();

        System.out.println(fuc(input , start , end-1));
    }
}