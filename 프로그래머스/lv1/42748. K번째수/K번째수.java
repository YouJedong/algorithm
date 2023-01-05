import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int resultNum = commands[i][2];
            
            // 특정 인덱스  copyOfRange(배열변수, 시작 인덱스, 끝 인덱스?)
            int[] temp = Arrays.copyOfRange(array, start-1 , end); 
            Arrays.sort(temp);
            answer[i] = temp[resultNum - 1];
        }

        return answer;
    }
}
