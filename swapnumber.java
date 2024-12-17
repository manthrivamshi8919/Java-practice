public class swapnumber {
    public static int Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        return 0;
    }

    public static void main(String args[]) {
        int a = 1;
        int b = 2;

        swap(a, b);

    }

}
