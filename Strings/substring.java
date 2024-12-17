public class substring {
    public static String string(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String args[]) {
        String str = "Manthrivamshi";
        System.out.println(string(str, 0, 7));
    }
}
