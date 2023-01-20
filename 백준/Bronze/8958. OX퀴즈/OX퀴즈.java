import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String str = "";
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      str = br.readLine();
      int result = 0;
      int point = 0;

      for (int j = 0; j < str.length(); j++) {
        if (str.charAt(j) == 'O') {
          point++;
          result += point;
        } else {
          point = 0;
        }
      }
      sb.append(result).append("\n");
    }
    br.close();
    System.out.println(sb);
  }
}