import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  static long[] tailRepo;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    br.close();

    tailRepo = new long[n];

    System.out.println(tailing(n));
  }

  private static long tailing(int n) {
    if(n == 1) return 1;
    if(n == 2) return 2;
    if(tailRepo[n - 1] != 0) return tailRepo[n - 1];
    return tailRepo[n - 1] = (tailing(n - 1) + tailing(n - 2)) % 10007;
  } 
}