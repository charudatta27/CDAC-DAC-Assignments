import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter 5 integers:");

        // Taking input
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding sum
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }

        // Calculating average
        average = (double) sum / 5;

        System.out.println("The average of the numbers is: " + average);
    }
}
