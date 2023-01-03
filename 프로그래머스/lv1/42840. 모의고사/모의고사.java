import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5,};
        int[] thr = {3,3,1,1,2,2,4,4,5,5};
        int scoreOne = 0, scoreTwo = 0, scoreThr = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if(one[i % one.length] == answers[i]) scoreOne++;
            if(two[i % two.length] == answers[i]) scoreTwo++;
            if(thr[i % thr.length] == answers[i]) scoreThr++;
        }
        
        int max = Math.max(scoreOne, Math.max(scoreTwo, scoreThr));
        
        ArrayList<Integer> list = new ArrayList();
        if(max == scoreOne) list.add(1);
        if(max == scoreTwo) list.add(2);
        if(max == scoreThr) list.add(3);
        
        answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}