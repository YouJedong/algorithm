import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] seq = new int[n];
    String[] tempArr = br.readLine().split(" ");
    for (int i = 0; i < seq.length; i++) {
      seq[i] = Integer.parseInt(tempArr[i]);
    }

    int[] dp = new int[n];

    for (int i = 0; i < seq.length; i++) {
      dp[i] = 1;

      for (int j = 0; j < i; j++) {
        if(seq[i] > seq[j] && dp[i] < dp[j] + 1) {
          dp[i] = dp[j] + 1;
        }
      }
    }

    int result = -1;
    for (int max : dp) {
      result = max > result ? max : result;
    }

    System.out.println(result);

  }
}