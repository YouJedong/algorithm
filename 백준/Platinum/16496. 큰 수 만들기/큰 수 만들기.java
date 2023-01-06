import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCount = sc.nextInt();
        int[] numbers = new int[numCount];
        for (int i = 0; i < numCount; i++) {
            numbers[i] = sc.nextInt();
        }
        String[] numToStrs = new String[numbers.length];
        
        // int배열 값을 String배열 값으로 변환
        for(int i = 0; i < numToStrs.length; i++) {
            numToStrs[i] = String.valueOf(numbers[i]);
        }
        
        // Comparator의 compareTo()를 이용하여, 비교할 두 값을 합쳐 비교 후 내림차순으로 정렬(ex 6,10 -> 106 : 610)  
        Arrays.sort(numToStrs, (compare1, compare2) -> (compare2 + compare1).compareTo(compare1 + compare2));
        
        // 배열의 모든 값이 0일 때 예외처리
        if (numToStrs[0].equals("0")) {
           System.out.println("0");
        } else { 
            // 답을 StringBuilder에 담아서 리턴한다.
            StringBuilder answer = new StringBuilder();
            for (int i = 0; i < numToStrs.length; i++) {
               answer.append(numToStrs[i]);
            }
            System.out.println(answer);
        }
    }
}