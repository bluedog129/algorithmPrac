package string;

import java.util.Locale;

public class multiTapKeyPadTextEntry_sol1 {
    public static void main(String[] args) {
        System.out.println("LOL");
    }
    public static int presses(String phrase) {
        int count = 0;
        String[] message = phrase.split("");

        for(int i = 0; i < message.length; i++) {
            switch (message[i].toLowerCase()) {
                case "a": case "d": case "g": case "j": case "m": case "p": case "t": case "w": case "*": case "#": case "1": case " ":
                    count += 1;
                    break;
                case "b": case "e": case "h": case "k": case "n": case "q": case "u": case "x": case "0":
                    count += 2;
                    break;
                case "c": case "f": case "i": case "l": case "o": case "r": case "v": case "y":
                    count += 3;
                    break;
                case "2": case "3": case "4": case "5": case "6": case "s": case "8": case "z":
                    count += 4;
                    break;
                case "7": case "9":
                    count += 5;
            }
        }


        return count;
    }
}
