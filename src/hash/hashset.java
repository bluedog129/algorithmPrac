package hash;

import java.util.*;

public class hashset {
    public static void main(String[] args) {
        Set set = new HashSet();

        // set의 크기가 6보다 작은 동안 1~45사이의 난수를 저장
        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random()*45) + 1;
            //set.add(new Integer(num));
            set.add(num);
        }
        // 정렬 이전의 set 출력
        System.out.println(set);
        // set은 정렬이 불가하다
        // 따라서 sort정렬을 적용하기 위해서
        // set -> List(set의 모든 요소를 List에 저장한다.)
        List list = new LinkedList(set);
        Collections.sort(list);
        // 정렬 이후의 List 출력
        System.out.println(list);
    }
}

