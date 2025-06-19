import java.util.Scanner;

public class EvenOddSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        switch (number % 2) {
            case 0:
                System.out.println(number + " is Even.");
                break;
            case 1:
                System.out.println(number + " is Odd.");
                break;
            default:
                System.out.println("Invalid input.");
        }

        scanner.close();
    }
}
