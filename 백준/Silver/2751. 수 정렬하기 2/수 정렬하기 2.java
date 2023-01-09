import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        int count = sc.nextInt();
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < count; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        
        for(int num : list) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
    