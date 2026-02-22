import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");

        // Taking input
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting array
        Arrays.sort(arr);

        System.out.println("Sorted array:");

        // Printing sorted array
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}