import java.util.Scanner;

public class que4 {
     
        public static void askForPositiveNumber() {
            Scanner sc = new Scanner (System.in);
            int number;

            do{

                System.out.print("enter positive number");
                number = sc.nextInt();
            }while(number<=0);

             System.out.println("You entered the positive number "+number);


        }
        public static void main(String[] args) {
            askForPositiveNumber();
          
        }


         sc.close();

    }
        

    

