import java.util.Arrays;
// 1. 정수(문자열)를 합쳐서 비교하기 위해 int배열 값을 String배열 값으로 변환
// 2. Comparator interface의 compareTo()를 이용하여, 비교하는 두 값을 합친 후 비교하여 정렬(sort)함
// 3. 배열의 모든 값이 0인 경우를 예외처리 함
// 4. StringBuilder에 담아서 리턴

class Solution {
    public String solution(int[] numbers) {
        String[] numToStrs = new String[numbers.length];
        
        for(int i = 0; i < numToStrs.length; i++) {
            numToStrs[i] = String.valueOf(numbers[i]);
        }
        
        // 비교할 두 값(문자열)을 합쳐 비교 후 내림차순으로 정렬(ex 6,10 - 106 : 610 -> 6,10 / 30, 32 - 3230 : 3032 -> 32,30)  
        Arrays.sort(numToStrs, (compare1, compare2) -> (compare2 + compare1).compareTo(compare1 + compare2));
        
        // 배열의 모든 값이 0일 때 예외처리
        if (numToStrs[0].equals("0")) {
           return "0";
        }
        
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numToStrs.length; i++) {
           answer.append(numToStrs[i]);
        }
        
        return answer.toString();
    }
}
