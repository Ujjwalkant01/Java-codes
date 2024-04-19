//PROGRAM TO FIND THE DAY IS WHICH DAY AND HOLIDAY OR NOT.
import java.util.*;

public class Day_or_weekday {

    public static void main(String[] args){
        int number;


        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number :");
        number = sc.nextInt();

        switch(number){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thrusday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

           default:
               System.out.println("Invalid input");

        }
        switch (number){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:

                System.out.println("Today is Holiday");
                break;
            case 7:

                System.out.println("Today is Holiday");
                break;


            default:
                System.out.println("Invalid input");
        }

    }
}
