public class MinMaxSimple {
    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 90, 20};

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
