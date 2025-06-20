public class SimpleBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15}; // Sorted array
        int target = 11; // Number to search

        int low = 0;
        int high = numbers.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] == target) {
                System.out.println("Number found at index: " + mid);
                found = true;
                break;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }
    }
}
