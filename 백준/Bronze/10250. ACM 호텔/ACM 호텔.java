import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StringBuilder sb = new StringBuilder();
    int testCount = sc.nextInt();
    for (int i = 0; i < testCount; i++) {
      int H = sc.nextInt();
      int W = sc.nextInt();
      int N = sc.nextInt();

      if(N <= H) {
        sb.append(N * 100 + 1).append("\n");
      } else {
        if(N % H == 0) {
          sb.append((H * 100) + (N / H)).append("\n");
        } else {
          sb.append(((N % H) * 100) + (N / H + 1)).append("\n");
        }
      }

    }
    sc.close();
    System.out.print(sb);

  }
}
