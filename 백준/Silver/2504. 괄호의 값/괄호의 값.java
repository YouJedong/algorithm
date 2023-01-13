import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String q = br.readLine();
        Stack<Character> stak = new Stack<>();
        int result = 0;
        int value = 1;
        
        for(int i = 0; i < q.length(); i++) {
            if(q.charAt(i) == '(') { 
                stak.push(q.charAt(i)); 
                value *= 2; 
            } else if(q.charAt(i) == '[') {
                stak.push(q.charAt(i)); 
                value *= 3;
            } else if (q.charAt(i) == ')') {
                if(stak.isEmpty() || stak.peek() != '(') {
                    result = 0;
                    break;
                } else if(q.charAt(i-1) == '(') {
                    result += value;
                }
                stak.pop();
                value /= 2;
            } else if (q.charAt(i) == ']') {
                if(stak.isEmpty() || stak.peek() != '[') {
                    result = 0;
                    break;
                } else if(q.charAt(i - 1) == '[') {
                    result += value;
                }
                stak.pop();
                value /= 3;
            } 
        }
        if(!stak.isEmpty()) sb.append(0).append("\n");
        else sb.append(result).append("\n");
        System.out.println(sb);

        
    }
}