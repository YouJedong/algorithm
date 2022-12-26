import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCount = sc.nextInt();
        
        for(int i = 0; i < testCount; i++) {
            int count = sc.nextInt();
            String str = sc.next();
            String result = "";
            
            for(int j = 0; j < str.length(); j++) {
                for(int k = 0; k < count; k++) {
                    result += str.charAt(j);
                }    
            }
            System.out.println(result);
        }
        sc.close();
    }
}