import java.util.*;

public class stringcompare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (s1.equals(s2)) {
            System.out.println("Given strings are equal");
        } else {
            System.out.println("Given strings are not equal");
        }

    }

}
