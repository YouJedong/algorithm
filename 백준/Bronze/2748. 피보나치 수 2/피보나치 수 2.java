import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    long[] result = new long[n + 1];
    result[0] = 0;
    if (n > 0) result[1] = 1;

    for (int i = 2; i <= n; i++) {
      if(n == 0 || n == 1) {
        break;
      } else {
        result[i] = result[i - 1] + result[i - 2];
      }
    }
    System.out.println(result[n]);
  }
}