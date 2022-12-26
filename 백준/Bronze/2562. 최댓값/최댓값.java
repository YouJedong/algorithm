import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];
        int result = 0;
        int resultNum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            result = result > nums[i] ? result : nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == result) {
                resultNum = i+1;
            }
        }
        System.out.println(result);
        System.out.println(resultNum);
         
    }
}