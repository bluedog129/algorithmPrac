package string;

import java.io.Serial;
import java.util.Locale;

public class duplicateEncoder {
    public static void main(String[] args) {
        // 조건 1. 중복되는 문자는 ')'로 변환
        // 조건 2. 중복되지 않는 문자는 '('로 변환
        // 다만 본래 '(' 인 문자 또한 중복되면 )로 변환
        // 그리고 본래 ')'가 중복이 안 되면 '('로 변환
        //   ()(
        //))))())))
        String word = "   ()(   ";
        System.out.println(encode(word));
    }
    public static String encode(String word) {
        StringBuilder builder = new StringBuilder(word);
        word = word.toLowerCase();

        for(int i = 0; i<word.length(); i++) {
            for(int j = 0; j<i+1; j++) {
                if(word.charAt(i) == word.charAt(j)) {
                    builder.setCharAt(i,')');
                    builder.setCharAt(j,')');
                }
            }
        }
        for(int k = 0; k<builder.length(); k++) {
            if(builder.charAt(k) != ')') {
                builder.setCharAt(k,'(');
            } else {
                builder.setCharAt(k,')');
            }
        }
        word = builder.toString();

        return word;
    }
}
