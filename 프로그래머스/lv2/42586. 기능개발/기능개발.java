import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            que.add((int)Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int pro = que.poll();
        int count = 1;
        while (!que.isEmpty()) {
            if (pro >= que.peek()) {
                count++;
                que.poll();
            } else {
                list.add(count);
                count = 1;
                pro = que.poll();
            }
        }
        list.add(count);
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}