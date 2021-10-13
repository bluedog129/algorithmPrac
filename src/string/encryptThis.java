package string;

public class encryptThis {
    public static void main(String[] args) {
        System.out.println(encryptThis("Hello"));
    }

    public static String encryptThis(String text) {
        if(text == null || text.isEmpty()) {
            return "";
        }

        final String[] words = text.split(" ");
        final StringBuilder sb = new StringBuilder();

        for(String word : words) {
            if(!word.isEmpty()) {
                // int형 변수에 char 형 변수값을 넣어주면 char형 변수값이 int형 아스키코드값으로 변환된다.
                final int firstChar = word.charAt(0);
                sb.append(firstChar);

                if(word.length() > 3) {
                    final String helper = word.charAt(word.length() - 1) +
                            word.substring(2, word.length()-1) +
                            word.charAt(1);
                    sb.append(helper);
                } else if (word.length() == 3) {
                    sb.append(word.charAt(2));
                    sb.append(word.charAt(1));
                } else if (word.length() == 2) {
                    sb.append(word.charAt(1));
                }

                sb.append(" ");
            }
        }

        sb.setLength(sb.length()-1);

        return new String(sb);
    }
}
