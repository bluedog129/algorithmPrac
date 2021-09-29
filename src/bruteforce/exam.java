package bruteforce;

import java.util.*;

public class exam {
    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(answers)));
    }

    public static int[] solution(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 1. 사람마다 맞은 수 만큼 카운드 한다.
        int[] hit = new int[3];
        for(int personIdx = 0; personIdx < hit.length; personIdx++) {
            for(int probIdx = 0; probIdx < answers.length; probIdx++) {
                // (innner루프 인덱스) % (outer루프 인덱스의 패턴 길이)
                if(patterns[personIdx][probIdx % patterns[personIdx].length] == answers[probIdx]) {
                    hit[personIdx]++;
                }
            }
        }

        // 2. hit[i]중 최대값 찾기
        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));

        // 3. 제일 많이 맞춘 사람 찾기
        List<Integer> list = new ArrayList<>();
        for(int i =0; i < hit.length; i++) {
            if(max == hit[i]) {
                list.add(i+1);
            }
        }

        // 4. answer 정렬
        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list) {
            answer[cnt++] = num;
        }
        return answer;
    }
}
