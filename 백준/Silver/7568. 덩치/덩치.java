import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] size = new int[N][2];
        
        String[] str;
        for(int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            size[i][0] = Integer.parseInt(str[0]);
            size[i][1] = Integer.parseInt(str[1]);
        }
        br.close();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++) {
            int rank = 1;
            
            for(int j = 0; j < N; j++) {
                if (j == i) continue;
                if (size[i][0] < size[j][0] && size[i][1] < size[j][1]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        System.out.println(sb);
    }
}