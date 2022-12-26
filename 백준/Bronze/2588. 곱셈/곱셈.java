import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNo = sc.nextInt();
        int secondNo = sc.nextInt();
        int firstSum = firstNo * (secondNo % 10);
        int secondSum = firstNo * ((secondNo / 10) % 10);
        int thirdSum = firstNo * (secondNo / 100);
        int result = firstSum + (secondSum * 10) + (thirdSum * 100);

        System.out.println(firstSum);
        System.out.println(secondSum);        
        System.out.println(thirdSum);        
        System.out.println(result);        
    }
}