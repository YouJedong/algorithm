import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
    try (
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {

      int count = Integer.parseInt(br.readLine());

      for (int i = 0; i < count; i++) {
        String sum = br.readLine();
        int a = Integer.parseInt(sum.split(" ")[0]);
        int b = Integer.parseInt(sum.split(" ")[1]);

        bw.write(a+b + "\n");
      }
      bw.flush();
    }
  }
}