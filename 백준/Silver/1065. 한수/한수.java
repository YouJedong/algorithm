import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 99;
        if (x < 10) {
            System.out.println(x);
        } else if (x < 100) {
            System.out.println(x);
        } else {
            for (int i = 111; i <= x; i++) {
                int a = i / 100;
                int b = (i - (a * 100)) / 10;
                int c = (i - (a * 100) - (b * 10));
                
                if (a - b == b - c) {
                    result++;
                } 
            }
            System.out.println(result);
        }
        
    }
}