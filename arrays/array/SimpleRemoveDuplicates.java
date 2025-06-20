import java.util.Arrays;

public class SimpleRemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40};
        int[] temp = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[k] = arr[i];
                k++;
            }
        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
