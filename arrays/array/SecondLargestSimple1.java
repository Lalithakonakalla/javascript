public class SecondLargestSimple1 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15, 30};

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest number is: " + secondMax);
    }
}
