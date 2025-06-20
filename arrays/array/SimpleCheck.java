public class SimpleCheck {
    public static void main(String[] args) {
        int[] arr = {10, 12, 5, 23, 8};

        boolean has12 = false;
        boolean has23 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 12) {
                has12 = true;
            }
            if (arr[i] == 23) {
                has23 = true;
            }
        }

        if (has12 && has23) {
            System.out.println("Array has both 12 and 23");
        } else {
            System.out.println("Array does not have both 12 and 23");
        }
    }
}
