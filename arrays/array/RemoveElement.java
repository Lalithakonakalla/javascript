public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int value = 30;
        int[] newArr = new int[arr.length - 1];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                newArr[j] = arr[i];
                j++;
            }
        }

        // Print the new array
        for (int i = 0; i < j; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
