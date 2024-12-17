public class smallestofnumbers {
    public static int getsmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }

        }
        return smallest;

    }

    public static void main(String[] args) {
        int numbers[] = { 22, 34, 12, 34, 21 };
        int smallestnumber = getsmallest(numbers);
        System.out.println("Smallest number:" + smallestnumber);

    }
}