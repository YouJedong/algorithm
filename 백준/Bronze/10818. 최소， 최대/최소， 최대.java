import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    int smallist = arr[0];
    int bigist = arr[0];

    if (n == 1) {
      bigist = smallist;
    } else {
      for (int i = 1; i < n; i++) {
        if (smallist > arr[i]) {
          smallist = arr[i];
          if (arr[i] > bigist) {
            bigist = smallist;    
          }
        } else if (bigist < arr[i]) {
          bigist = arr[i];
        }
      }
    }
    System.out.println(smallist + " " + bigist);
  }
}