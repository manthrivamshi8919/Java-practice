public class lowetouppercase {
    public static String touppercase(String str) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length; i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(caharacter.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }

    }

    public static void main(String args[]) {
        String str = "my name is vamshi";
        System.out.println(touppercase(str));
    }

}
