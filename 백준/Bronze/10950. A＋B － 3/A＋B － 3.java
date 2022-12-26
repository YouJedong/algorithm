import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testNo = sc.nextInt();
        int result = 0;
        for (int i = 0; i < testNo; i++) {
            result = sc.nextInt() + sc.nextInt();
            System.out.println(result);
        }
    }
}