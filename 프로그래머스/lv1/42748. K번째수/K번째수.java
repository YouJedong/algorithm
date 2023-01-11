import java.util.Arrays;
// 1. 시작점, 끝점, k번째 수 변수에 담기
// 2. array를 시작점과 끝점으로 잘라서(copyOfRange) temp배열에 담기
// 3. 자른 배열을 정렬(sort)
// 4. k번째수를 answer배열에 담음
// 5. commands개수만큼 반복

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int resultNum = commands[i][2];
            
            // 특정 인덱스  copyOfRange(배열변수, 시작 인덱스, 끝 인덱스? 배열 길이?)
            int[] temp = Arrays.copyOfRange(array, start-1 , end); // ex) 0 ~ 4 -> .copyOfRange(array, 0, 5) 
            Arrays.sort(temp);
            answer[i] = temp[resultNum - 1];
        }

        return answer;
    }
}
