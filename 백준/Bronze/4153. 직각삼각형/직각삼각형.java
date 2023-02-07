import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

  static int a, b, c;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    a = Integer.parseInt(st.nextToken());
    b = Integer.parseInt(st.nextToken());
    c = Integer.parseInt(st.nextToken());


    while (a + b + c != 0) {   
      int[] setNums = numSetting(a, b, c);
      a = setNums[0];
      b = setNums[1];
      c = setNums[2];

      if(a*a + b*b == c*c) {
        sb.append("right").append("\n");
      } else {
        sb.append("wrong").append("\n");
      }
      st = new StringTokenizer(br.readLine());
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      c = Integer.parseInt(st.nextToken());
    }
    System.out.print(sb);
  }

  private static int[] numSetting(int a, int b, int c) {
    int[] temp = {a, b, c};
    Arrays.sort(temp);

    return temp;

  }


}
