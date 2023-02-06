import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int K = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    int[] lenlines = new int[K];

    long max = 0;

    for (int i = 0; i < K; i++) {
      lenlines[i] = Integer.parseInt(br.readLine());
      if(max < lenlines[i]) {
        max = lenlines[i];
      }
    }

    max++;

    long min = 0;
    long mid = 0;

    while(min < max) {
      mid = (min + max) / 2;

      long count = 0;

      for (int i = 0; i < K; i++) {
        count += lenlines[i] / mid;

      }
      if (count >= N) {
        min = mid + 1;
      } else {
        max = mid;
      }
    }

    System.out.println(min - 1);


  }

}
