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

        // Sort the array first
        Arrays.sort(arr);

        System.out.println("Enter the number to search:");
        int search = sc.nextInt();

        // Binary Search
        int index = Arrays.binarySearch(arr, search);

        if (index >= 0) {
            System.out.println("The number " + search + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}
