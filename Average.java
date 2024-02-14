import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        int a;
        int b;
        int Average;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the vlaue of a:");
        a = input.nextInt();

        System.out.println("Enter the value of b:");
        b = input.nextInt();

        Average = (a + b) / 2;

         System.out.printf("Average is %d\n", Average);
       

    }
    
}
