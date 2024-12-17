public class largestnumber {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];

            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 4, 5, 8, 3 };
        System.out.println("largest of nimbers is:" + getLargest(numbers));
    }

}
