package hash;

import java.util.*;

public class num7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<String> set = new HashSet<>();  // set을 사용함

        for(int i = 0; i<n; i++) {
            String name = sc.next();
            String commute = sc.next();

            if(commute.equals("enter")) {
                // enter면 set에 추가
                set.add(name);
            } else {
                // leave면 set에서 삭제
                set.remove(name);
            }
        }
        // sort와 ListIterator를 사용하기 위해 set --> list 작업을 했다.
        List<String> array = new ArrayList<String>(set);
        // 정렬
        Collections.sort(array);  
        // ListIterator를 사용해서 반대로 탐색
        ListIterator<String> iter = array.listIterator(array.size());

        // Iterator 사용
        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }
    }
}
