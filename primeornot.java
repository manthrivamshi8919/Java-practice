import java.util.*;

public class primeornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("n is a prime number");
        } else {
            boolean isprime = true;
            for (int i = 2; i <= n - 1; i++) {
                if (n % 2 == 0) {
                    isprime = false;
                }
            }
            if (isprime == true) {
                System.out.println("n is a prime number");
            } else {
                System.out.println("n is not a prime number");
            }
        }
    }

}
