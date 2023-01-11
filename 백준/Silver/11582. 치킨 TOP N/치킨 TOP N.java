import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
    
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        int k = Integer.parseInt(br.readLine());
        
        int div = count / k;
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < count; i += div) {
            ArrayList<Integer> temp = new ArrayList<>(list.subList(i, i + div));
            Collections.sort(temp);
            answer.addAll(temp);
        }
        
        for (int i = 0; i < count; i++) {
            bw.write(answer.get(i) + " ");
        };
        br.close();
        bw.flush();
    }
}