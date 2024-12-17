public class palindrome {
    public static boolean ispalindrome(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) == str.charAt(n - 1 - i)) {
                System.out.println("Given string is palindrome");
                return true;

            }

        }
        System.out.println("Given String not a palindrome");
        return false;
    }

    public static void main(String args[]) {
        String str = "mom";
        ispalindrome(str);
    }
}
