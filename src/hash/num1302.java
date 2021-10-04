package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class num1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String str = new String();

        for(int i = 0; i<n; i++) {
            str = br.readLine();

            if(map.containsKey(str)) {
                map.replace(str, map.get(str)+1);
            } else {
                map.put(str, 1);
            }
        }
        int max = 0;
        for (String a : map.keySet()) {
            max = Math.max(max, map.get(a));
        }

        ArrayList<String> a1 = new ArrayList<String>(map.keySet());
        Collections.sort(a1);
        for(String a : a1) {
            if(map.get(a) == max) {
                System.out.println(a);
                break;
            }
        }

    }
}
