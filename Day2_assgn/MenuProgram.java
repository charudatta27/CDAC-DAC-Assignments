import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Grade Evaluation System");
            System.out.println("2. Leap Year Check");
            System.out.println("3. Day of the Week");
            System.out.println("4. Identify Default Values");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Grade Evaluation
                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    if (marks >= 90)
                        System.out.println("Grade: A");
                    else if (marks >= 75)
                        System.out.println("Grade: B");
                    else if (marks >= 50)
                        System.out.println("Grade: C");
                    else
                        System.out.println("Grade: Fail");
                    break;

                case 2:
                    // Leap Year Check
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();

                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        System.out.println("Leap Year");
                    else
                        System.out.println("Not a Leap Year");
                    break;

                case 3:
                    // Day of the Week
                    System.out.print("Enter number (1-7): ");
                    int day = sc.nextInt();

                    switch (day) {
                        case 1: System.out.println("Monday"); break;
                        case 2: System.out.println("Tuesday"); break;
                        case 3: System.out.println("Wednesday"); break;
                        case 4: System.out.println("Thursday"); break;
                        case 5: System.out.println("Friday"); break;
                        case 6: System.out.println("Saturday"); break;
                        case 7: System.out.println("Sunday"); break;
                        default: System.out.println("Invalid day number");
                    }
                    break;

                case 4:
                    // Default Values
                    int a = 0;
                    double b = 0.0;
                    boolean c = false;
                    char d = '\u0000';

                    System.out.println("Default int: " + a);
                    System.out.println("Default double: " + b);
                    System.out.println("Default boolean: " + c);
                    System.out.println("Default char: " + d);
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
