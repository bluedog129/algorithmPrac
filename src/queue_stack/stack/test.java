package queue_stack.stack;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class test {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());

        while (t-- > 0) {
            String str =bf.readLine() + "\n";
            Stack<Character> s = new Stack<>();
            ArrayList<Character> arr = new ArrayList<Character>();
            int count = 0;
            for (char ch : str.toCharArray()) {
                if(ch == '\n' || ch == ' ') {
                    while (!s.isEmpty()) {
                        arr.add(s.pop());
                    }
                } else {
                    s.push(ch);
                }
            }
            // 비교
            for(int i = 0; i<arr.size(); i++) {
                if(str.charAt(i) == arr.get(i)) {
                    count++;
                } else {
                    count = 0;
                }
            }
            if(count == arr.size()) {
                System.out.println("Mirror");
            } else {
                System.out.println("Normal");
            }
        }
    }
}
