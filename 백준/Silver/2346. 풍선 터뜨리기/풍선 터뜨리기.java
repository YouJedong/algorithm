import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        Deque<Balloon> deq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
          deq.add(new Balloon(i + 1, sc.nextInt()));
        }

        while (deq.size() > 1) {
          Balloon bl = deq.poll();
          sb.append(bl.idx).append(" ");
          int move = bl.move;
          if (move < 0) {
            while(move < 0) {
              deq.addFirst(deq.pollLast());
              move++;
            }
          } else {
            move--;
            while(move > 0) {
              deq.addLast(deq.pollFirst());
              move--;
            }
          }
        }
        sb.append(deq.poll().idx);

        System.out.println(sb);

      }

      static class Balloon {
        int idx;
        int move;

        Balloon(int idx, int move) {
          this.idx = idx;
          this.move = move;
        }
      }
}