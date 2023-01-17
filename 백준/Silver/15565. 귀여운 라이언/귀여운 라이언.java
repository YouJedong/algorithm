import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        
        int[] numList = new int[num];
        for(int i = 0; i < num; i++) {
            numList[i] = sc.nextInt();
        }
        
        int answer = Integer.MAX_VALUE;
        int count = 0;
        int left = 0;
        int right = 0;
        
        while(left <= right && right <= numList.length) {
            if(count < target) {
                if(right == numList.length) {
                    break;
                } else if(numList[right] == 1) {
                    count++;
                }
                right++;
            } else {
                answer = Math.min(answer, right - left);
                if(numList[left] == 1) {
                    count--;
                }
                left++;
            }
        }
        if(answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}