import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Stack<Integer> stack = new Stack<>();

    String inStr = "";
    int numToPush = 0;
    StringBuilder sb = new StringBuilder();
    for (int i = 0 ; i < N; i++) {
      inStr = br.readLine();
      if(inStr.contains("push")) {
        numToPush = Integer.parseInt(inStr.substring(5, inStr.length()));
        stack.push(numToPush);

      } else if (inStr.equals("top")) {
        if (!stack.empty()) {
          sb.append(stack.peek()).append("\n");
        } else {
          sb.append(-1).append("\n");
        }

      } else if (inStr.equals("size")) {
        sb.append(stack.size()).append("\n");

      } else if (inStr.equals("empty")) {
        if(stack.empty()) {
          sb.append(1).append("\n");
        } else {
          sb.append(0).append("\n");
        }

      } else if (inStr.equals("pop")) {
        if(stack.empty()) {
          sb.append(-1).append("\n");
        } else {
          sb.append(stack.pop()).append("\n");
        }
      }
    }
    System.out.println(sb);
  }
}
