import java.util.Scanner;

public class Days_Months {
    public static void main(String[] args){
        int month,days;
        System.out.println("Enter Month:");
        Scanner sc= new Scanner(System.in);
        month = sc.nextInt();

        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("there are 31 days in these maonths ");
                break;

            case 2:
                days=28;
                System.out.println(" 28 day in this month");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are 30 days in this month.");
                break;

            default:
                System.out.println("No data");

        }

    }
}
