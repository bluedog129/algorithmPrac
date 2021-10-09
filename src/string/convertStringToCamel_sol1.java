package string;

public class convertStringToCamel {
    public static void main(String[] args) {
        String st = "the-stealth-warrior";

        System.out.println(makeCamel(st));
    }

    public static String makeCamel(String s) {
        StringBuilder sb = new StringBuilder();
        Boolean nextCapital = false;

        for(int i = 0; i<s.length(); i++) {
            if(Character.isLetter(s.charAt(i))) {
                char tmp = s.charAt(i);

                if(nextCapital) tmp = Character.toUpperCase(tmp);

                sb.append(tmp);

                nextCapital = false;
            } else {
                nextCapital = true;
            }
        }

        return sb.toString();
    }
}