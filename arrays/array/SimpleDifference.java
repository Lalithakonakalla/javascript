public class SimpleDifference {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 3, 8};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int diff = max - min;
        System.out.println("Difference = " + diff);
    }
}
