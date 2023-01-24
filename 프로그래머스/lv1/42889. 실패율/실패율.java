import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        List<Stage> stageInfos = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            int stageNum = i;
            int challenger = 0; 
            int passer = 0;
            
            for (int j = 0; j < stages.length; j++) {
                if(i == stages[j]) {
                    challenger++;
                } else if(i < stages[j]) {
                    passer++;
                }
            }
            stageInfos.add(new Stage(stageNum, challenger, passer));
        }
        
        Collections.sort(stageInfos, new Comparator<Stage>() {
            
            public int compare(Stage s1, Stage s2) {
                if(s1.failRate > s2.failRate) {
                    return -1;
                } else if(s1.failRate < s2.failRate) {
                    return 1;
                } else {
                    if(s1.stageNum < s2.stageNum) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            }        
        });
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = stageInfos.get(i).stageNum;
        }
        
        return answer;
    }
    
    class Stage {
        int stageNum;
        double failRate;
        
        public Stage(int stageNum, int challenger, int passer) {
            this.stageNum = stageNum;
            this.failRate = (double) challenger / (passer + challenger);
            System.out.println(this.failRate);
        }
    }
}