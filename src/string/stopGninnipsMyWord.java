package string;

import java.util.Arrays;
import java.util.stream.Stream;

public class stopGninnipsMyWord {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }
    public static String spinWords(String sentence) {
        StringBuffer sb = new StringBuffer();
        Stream<String> words = Arrays.stream(sentence.split(""));

        words.forEach(item -> {
            if (item.length() >= 5) {
                for (int i = item.length() - 1; i >= 0; i--) {
                    sb.append(item.charAt(i)); } sb.append(" ");
                    } else { sb.append(item).append(" ");
                        } });

        return sb.toString().strip();
    }
}