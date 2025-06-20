public class EvenOddInArray {
    public static void main(String[] args) {
        int[] arr = {10, 21, 4, 15, 8, 33};

        System.out.println("Even numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("Odd numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
