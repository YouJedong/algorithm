// 상한(Upper Bound)를 구한다.
// ? 구하고 싶은 값(N)에서 중복 값(랜선을 자를 때 200 or 199 or 198로 잘라도 11개가 나온다)
//   그렇기 때문에 상한(10개)를 만들 수 있는 길이 중에 최솟값을 구해서 -1 한 값이 우리가 구하고 싶은 값이다. 

// 상한선(최대길이 + 1)이기 때문에 랜선의 길이는 int 최대값을 넘을 수 있어서 long타입으로..


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());

    int K = Integer.parseInt(st.nextToken());
    int N = Integer.parseInt(st.nextToken());

    int[] lenlines = new int[K];

    long max = 0;

    for (int i = 0; i < K; i++) {
      lenlines[i] = Integer.parseInt(br.readLine());
      if(max < lenlines[i]) {
        max = lenlines[i];
      }
    }

    max++; // mid가 0이 될 때 생기는 오류를 방지하기 위해 최대길이 + 1로 셋팅한다.

    long min = 0;
    long mid = 0;

    while(min < max) { // 이분 탐색
      mid = (min + max) / 2;

      long count = 0;

      for (int i = 0; i < K; i++) {
        count += lenlines[i] / mid;

      }
      if (count >= N) {
        min = mid + 1; // 만들수 있는 개수 같거나 더 큰 값은 필요 없기 때문에 + 1
      } else {
        max = mid;
      }
    }

    System.out.println(min - 1);


  }
  
  

}

// 다른풀이
//package test;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Comparator;
//
//class BaekJoon1181_01 {
//  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int N = Integer.parseInt(br.readLine());
//    String[] arr = new String[N];
//    for(int i = 0; i < N; i++) {
//      arr[i] = br.readLine();
//    }
//
//    Arrays.sort(arr, new Comparator<String>() {
//      @Override
//      public int compare(String o1, String o2) {
//        if (o1.length() < o2.length()) {
//          return -1;
//        } else if (o1.length() > o2.length()) {
//          return 1;
//        } else {
//          return o1.compareTo(o2);
//        }
//      }
//    });
//
//    for (int i = 0; i < arr.length; i++) {
//      for (int j = i + 1; j < arr.length; j++) {
//        if (arr[i].length() != arr[j].length() || !arr[i].equals(arr[j])) {
//          break;
//        } else {
//          i++;
//          continue;
//        }
//      }
//      System.out.println(arr[i]);
//    }
//  }
//}
