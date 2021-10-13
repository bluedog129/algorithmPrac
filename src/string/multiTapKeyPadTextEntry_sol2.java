package string;

import java.util.Locale;

public class multiTapKeyPadTextEntry_sol2 {
    public static void main(String[] args) {
        System.out.println("LOL");
    }

    static String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "*", "0", "#"};

    public static int presses(String phrase) {
        int nPresses = 0;

        for(char c : phrase.toUpperCase().toCharArray()) {
            for(String s : keys) {
                nPresses += s.indexOf(c) + 1;
            }
        }
        return nPresses;
    }

}
