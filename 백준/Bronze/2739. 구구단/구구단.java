import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int no = sc.nextInt();
        int result = 0;
        
        for(int i = 1; i < 10; i++) {
            result = no * i;
            System.out.println(no + " * " + i + " = " + result);
        }
    }
}