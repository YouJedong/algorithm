import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    if (A < B) {
      int temp = A;
      A = B;
      B = temp;
    }

    int GCD = gcd(A, B);
    int LCM = A * B / GCD;

    System.out.println(GCD + "\n" + LCM);


  }

  private static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }


}