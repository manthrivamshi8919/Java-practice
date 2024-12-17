public class binomialcoff {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

    public static int binomialcoeffi(int n, int r) {
        int n = fact(n);
        int r = fact(r);
        int nmr = fact(n - r);
        int binomial = n / (r * (n - r));
        return binomial;

    }

    public static void main(String args[]) {
        System.out.println(binomialcoeffi(3));
    }

}
