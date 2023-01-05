import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] temp = {};

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int resultNum = commands[i][2];

            temp = new int[(end - start) + 1];
            temp = Arrays.copyOfRange(array, (start-1) , end);
            Arrays.sort(temp);
            answer[i] = temp[resultNum - 1];
        }

        return answer;
    }
}
