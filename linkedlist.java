public class linkedlist {
    public static int Linkedlist(int marks[], int key) {
        for (int i = 0; i <= marks.length; i++) {
            if (marks[i] == key) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int marks[] = { 11, 22, 33, 44, 55, 66 };
        int key = 55;

        int index = Linkedlist(marks, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("key is present at:" + index);
        }

    }

}
