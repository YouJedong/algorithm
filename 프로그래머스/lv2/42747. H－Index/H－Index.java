import java.util.Arrays;
// 1. H-Index의 최대치인 발표한 논문 편수부터 비교하기 위해 answer변수에 담음
// 2. 논문 인용 횟수를 기준으로 오름차순으로 정렬한다.
//    왜? 제일 인용 횟수가 적은 것부터 비교할 때 answer보다 크거나 같다면 뒤에 있는 논문 인용횟수보다 크다는 것이기 때문에 H-Index가 된다.
// 3. H-Index를 찾는다.


class Solution {
    public int solution(int[] citations) {
        int answer = citations.length;
        Arrays.sort(citations);
        
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= answer) {
                break;
            }
            answer--;
        }
        
        return answer;
    }
}
