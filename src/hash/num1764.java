package hash;

import java.io.*;
import java.util.*;

public class num1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 듣도 못한 사람 n
        int m = Integer.parseInt(st.nextToken()); // 보도 못한 사람 m

        Set<String> hs = new HashSet<String>(); // 듣도 못한 사람 저장
        List<String> list = new ArrayList<String>();
        for(int i =0; i<n; i++) {
            hs.add(br.readLine()); // 듣도 못한 사람 hashset에 저장
        }
        for (int i=0; i<m; i++) {
            String str = br.readLine();
            // 보도 못한 사람이 듣도 못한 사람에도 포함 되는 경우 => list에 저장
            if(hs.contains(str)) {
                list.add(str);
            }
        }
        // 듣도 보도 못한 사람 사전순으로 정렬
        Collections.sort(list);
        System.out.println(list.size()); // 듣도 보도 못한 사람의 수 == list의 크기

        // 듣도 보도 못한 사람 출력
        for(int i=0; i<list.size(); i++) {
            bw.write(list.get(i));
            bw.flush();
            System.out.println();
        }
        bw.close();
        br.close();
    }
}
