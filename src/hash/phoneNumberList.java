package hash;
import java.util.*;

public class phoneNumberList {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        System.out.println(solution(phone_book));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        // 1. HashMap 만들기
        HashMap<String, Integer> hm = new HashMap<>();

        // 2. 모든 전화번호 Hashing 하기 (HashMap에 추가하기)
        for(int i = 0; i< phone_book.length; i++) {
            hm.put(phone_book[i], i);
        }

        // 3. 다시 돌며 각 전화번호의 일부가 HashMap에 있는지 확인하기 (접두어가 있는지 확인)
        for (int i =0; i<phone_book.length; i++) {
            for(int j = 1; j<phone_book[i].length(); j++) {
                    if(hm.containsKey(phone_book[i].substring(0,j))) {
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    }
}
