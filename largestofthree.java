import java.util.*;

public class largestofthree {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A >= B && A >= C) {
            System.out.println("A is greatest number");
        } else if (B >= C) {
            System.out.println("B is greatest number");
        } else {
            System.out.println("C is greatest number");
        }
    }

}
