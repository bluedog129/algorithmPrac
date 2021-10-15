package string;

public class mumbling {
    public static void main(String[] args) {
        System.out.println(accum("RqaEzty"));
    }
    public static String accum(String s) {
        char[] stringChar = s.toCharArray();
        StringBuilder mumbling = new StringBuilder();
        int counter = 1;

        // letter 문자형 변수에 stringChar 문자형배열 변수를 for문으로 넣는다.
        for (char letter: stringChar) {
            for(int i = 0; i<counter; i++) {
                if(i== 0) {
                    mumbling.append(Character.toUpperCase(letter));
                }
                else {
                    mumbling.append(Character.toLowerCase(letter));
                }
            }
            mumbling.append('-');
            counter++;
        }
        return mumbling.toString().substring(0, mumbling.length()-1);
    }
}
