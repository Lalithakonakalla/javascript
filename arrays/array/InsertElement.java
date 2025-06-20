public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int value = 25;
        int pos = 2;  

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = value;

        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print the new array
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
