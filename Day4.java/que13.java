import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] arr = new Integer[5];

        System.out.println("Enter 5 integers:");

        // Taking input
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int search = sc.nextInt();

        // Checking using Arrays.asList()
        if (Arrays.asList(arr).contains(search)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}