package recognition;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() + sc.nextLine() + sc.nextLine();
        int[] alg = {2, 1, 2, 4, -4, 4, 2, -1, 2};
        int a10 = 0;
        for (int i = 0; i < 9; i++) {
            a10 += str.charAt(i) == 'X' ? alg[i] : 0;
        }
        System.out.println(a10 - 5 > 0 ? "This number is 0" : "This number is 1");
    }
}
