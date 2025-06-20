public class AverageAverage {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : arr) {
            sum = sum + num;
        }

        double average = sum / (double) arr.length;

        System.out.println("Average = " + average);
    }
}
