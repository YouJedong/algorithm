import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String q = br.readLine();
        br.close();
        
        String acd = "1 2 3 4 5 6 7 8";
        String dcd = "8 7 6 5 4 3 2 1";
        
        if (q.equals(acd)) {
          System.out.println("ascending");
        } else if (q.equals(dcd)) {
          System.out.println("descending");
        } else {
          System.out.println("mixed");
        } 
            
    }
}