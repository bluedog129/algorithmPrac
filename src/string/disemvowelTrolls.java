package string;

public class disemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("N ffns bt,\\nYr wrtng s mng th wrst 'v vr rd"));
    }
    public static String disemvowel(String str) {
        StringBuffer sb = new StringBuffer(str);

        for(int i = 0; i<sb.length(); i++) {
            if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u'
            || sb.charAt(i) == 'A' || sb.charAt(i) == 'E' || sb.charAt(i) == 'I' || sb.charAt(i) == 'O' || sb.charAt(i) == 'U') {
                sb.deleteCharAt(i);
            }
        }

        return sb.toString();
    }
    
}