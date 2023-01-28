import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  static long[] fbncRepo;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    br.close();
    fbncRepo = new long[n + 1];

    System.out.println(fbnc(n));

  }
  
  private static long fbnc(int n) {
    if(n == 0) return 0;
    if(n == 1) return 1;
    if(fbncRepo[n] != 0) return fbncRepo[n];
    return fbncRepo[n] = fbnc(n - 1) + fbnc(n - 2);
  }
}