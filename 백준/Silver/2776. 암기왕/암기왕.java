import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    for (int a = 0; a < n; a++) {
      int oneNum = Integer.parseInt(br.readLine());
      StringTokenizer st = new StringTokenizer(br.readLine());
      int[] oneNote = new int[oneNum];
      for (int i = 0; i < oneNum; i++) {
        oneNote[i] = Integer.parseInt(st.nextToken()); 
      }

      int twoNum = Integer.parseInt(br.readLine());
      st = new StringTokenizer(br.readLine());
      int[] twoNote = new int[twoNum];
      for (int i = 0; i < twoNum; i++) {
        twoNote[i] = Integer.parseInt(st.nextToken()); 
      }

      Arrays.sort(oneNote); 

      boolean[] b = new boolean[twoNum];

      for (int i = 0; i < twoNum; i++) {
        int low = 0;
        int high = oneNum - 1;
        while (high >= low) {
          int mid = (high + low) / 2;

          if(twoNote[i] == oneNote[mid]) {
            b[i] = true;
            break;
          } else if(twoNote[i] < oneNote[mid]) {
            high = mid - 1;
          } else {
            low = mid + 1;
          }
        }
      }
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < twoNum; i++) {
        sb.append(b[i] ? 1 : 0).append("\n");
      }
      System.out.print(sb);

    }
  }
}
