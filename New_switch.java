//Switch case program.
import java.util.Scanner;

public class New_switch {
    public static void main(String[] args){
        int age;
        System.out.println("Enter your age:");
        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();

       switch (age){
           case 18:
               System.out.println("Your are Adult now!");
               break;

           case 21:
               System.out.println("Your are eligible for any job!");
               break;

           case 60:
               System.out.println("Age of Retirement");
               break;

           default:
               System.out.println("Enjoy your Life baby...!!");

        }

        }

    }


