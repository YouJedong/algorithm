import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int result = 0;
    String str = sc.nextLine();
    sc.close();

    for (int i = 0; i < n; i++) {
      result += Character.getNumericValue(str.charAt(i));
    }
    System.out.println(result);

  }
}