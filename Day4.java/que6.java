import java.util.Scanner;

public class que6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 integers:");

        // Taking input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing using for-each loop
        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
