import java.util.Scanner;

class Que1 {

    // Method must be outside main
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        int result = sum(num1, num2);

        System.out.println("The sum is: " + result);

        sc.close();
    }
}

      


    
