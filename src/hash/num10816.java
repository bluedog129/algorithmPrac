package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class num10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // n개 만큼 상근이가 가지고 있는 숫자카드에 적혀있는 수를 hashmap에 저장
        for(int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());

            // key값은 숫자카드에 적힌 수, value는 각 Key값의 갯수
            map.put(key, map.getOrDefault(key, 0)+ 1);
        }

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer((br.readLine()), " ");
        for(int i =0; i< n; i++) {
            int key = Integer.parseInt(st.nextToken());
            // 상근이가 가진카드에서 뽑은 카드를 key값으로 확인하여
            // sb 변수에 넣는다.
            sb.append(map.getOrDefault(key, 0)).append(' ');
        }
        System.out.println(sb);
    }
}