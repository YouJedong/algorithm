import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.printf("Case #%d: " + (sc.nextInt() + sc.nextInt()) + "\n", (i + 1));
        }
    }
}