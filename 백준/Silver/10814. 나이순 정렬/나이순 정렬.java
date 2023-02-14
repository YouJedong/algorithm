import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    User user;
    List<User> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      user = new User(Integer.parseInt(st.nextToken()), st.nextToken(), (i + 1));
      list.add(user);
    }

    Collections.sort(list);

    StringBuilder sb = new StringBuilder();
    for (int i = 0 ; i < N; i++) {
      sb.append(list.get(i).age + " " + list.get(i).name).append("\n");
    }
    System.out.print(sb);

  }

}

class User implements Comparable<User> {
  int age;
  String name;
  int index;

  public User(int age, String name, int index) {
    this.age = age;
    this.name = name;
    this.index = index;
  }

  public int compareTo(User u) {
    int result = this.age - u.age;
    if(result <= -1) {
      return -1;
    } if(result == 0) {
      return this.index - u.index;
    } else {
      return 1;
    }
  }

}
