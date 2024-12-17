public class numberpattern {
    public static void main(String args[]) {
        int n = 10;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= n - line + 1; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }

}
