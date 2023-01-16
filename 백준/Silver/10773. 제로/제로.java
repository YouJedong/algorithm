import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < N; i++) {
          int q = sc.nextInt();
          if(q == 0 && !stack.isEmpty()) {
            stack.pop();
          } else {
            stack.push(q);
          }
        }
    
        sc.close();

        while(!stack.isEmpty()) {
          result += stack.pop();
        }
        System.out.println(result);
    }
        
}
