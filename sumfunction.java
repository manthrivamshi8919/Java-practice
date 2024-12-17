import java.util.*;

public class sumfunction {
    public static int calculation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value:");
        int a = sc.nextInt();
        System.out.print("Enter b value:");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("sum is:" + sum);
        return 0;
    }

    public static void main(String args[]) {

        calculation();

    }

}
