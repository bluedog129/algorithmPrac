package string;

import java.util.Arrays;
import java.util.Locale;

public class vowelCount {
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }
    public static int getCount(String str) {
        int vowelsCount = 0;
        str = str.toLowerCase();

        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u') {
                vowelsCount++;
            }
        }

        return vowelsCount;
    }
}
