package queue_stack.queue;

import java.util.LinkedList;
import java.util.Queue;

public class truck {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weigh = 10;
        int[] truck_weights = {7,4,5,6};

    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Queue<Integer> q = new LinkedList<>();

        int sum = 0;
        for(int w : truck_weights) {
            while(true) {
                if(q.isEmpty()) {
                    q.offer(w);
                    sum += w;
                    time++; // 다리에 오를 때 시간 추가
                    break;
                } else if(q.size() == bridge_length) {
                    // 다리위에 트럭이 가득 찼을 경우
                    sum -= q.poll();
                } else {// 다리 길이만큼 큐가 차지 않았음
                    // weight 값이 넘는다면 0을 넣어 큐에 있는 트럭이 다리를 건너게 만듦
                    if( sum + w > weight) {
                        q.offer(0);
                        time++;
                    } else { // weight 값을 넘지 않는 선에서 새로운 트럭을 다리에 올려줌
                        q.offer(w);
                        sum += w;
                        time++;
                        break;
                    }
                }
            }
        }
        return time + bridge_length;
    }
}