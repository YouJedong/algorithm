import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int lastNo = sc.nextInt();
            int result = 0;
            
            for (int i = 1; i <= lastNo; i++) {
                result += i;
            }
            System.out.println(result);
        
    }
}