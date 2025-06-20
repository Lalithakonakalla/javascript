public class SimpleMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[99];
        int k = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != 45) {
                arr[k] = i;
                k++;
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int total = 100 * 101 / 2;
        int missing = total - sum;

        System.out.println("Missing number is: " + missing);
    }
}
