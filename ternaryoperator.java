import java.util.*;

public class ternaryoperator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String type = ((n % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }

}
