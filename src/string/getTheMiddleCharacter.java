package string;

public class getTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
    }
    public static String getMiddle(String word) {
        if(word.length() % 2 == 0) {
            return word.substring(word.length()/2-1, (word.length()/2)+1);
        } else {
            return word.substring(word.length()/2, (word.length()/2)+1);
        }


    }
}
