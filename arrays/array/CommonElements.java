public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.println("Common elements are:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    break; // Avoid duplicates
                }
            }
        }
    }
}
