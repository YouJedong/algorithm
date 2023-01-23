import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    String[] arr = new String[N];
    for(int i = 0; i < N; i++) {
      arr[i] = br.readLine();
    }
    br.close();

    Arrays.sort(arr, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
          return -1;
        } else if (o1.length() > o2.length()) {
          return 1;
        } else {
          return o1.compareTo(o2);
        }
      }
    });

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i].length() != arr[j].length() || !arr[i].equals(arr[j])) {
          break;
        } else {
          i++;
          continue;
        }
      }
      sb.append(arr[i]).append("\n");
    }
    System.out.println(sb);
  }
}