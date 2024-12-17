public class binarysearch {
    public static int binarysearching(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {

                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String args[]) {
        int numbers[] = { 2, 34, 33, 12, 14 };
        int key = 33;
        System.out.println("given number is present at:" + binarysearching(numbers, key));

    }
}
