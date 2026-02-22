// print multiple of 3 between 1 to N

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();


        for(int i = 1; i <= n; i++){
            if(i%3==0){
            System.out.println(i + " ");
            }
        }

    }
    
}