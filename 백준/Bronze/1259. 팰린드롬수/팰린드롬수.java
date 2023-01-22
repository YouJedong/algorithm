import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      boolean YN = true;
      String str = sc.nextLine();

      if(str.equals("0")) break;  

      for (int i = 0; i < str.length() / 2; i++) {
        if(str.charAt(i) != str.charAt(str.length() - (i + 1))) {
          YN = false;
        }
      }
      if(YN) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
    sc.close();
  }
}