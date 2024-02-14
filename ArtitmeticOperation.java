import java.util.Scanner;
public class ArtitmeticOperation {
    public static void main(String[] args){
        int num1;
        int num2;
        int sum;
        int product;
        int remainder;
        int division;
        int subtraction;

        Scanner input = new Scanner(System.in);
         System.out.println("Enter the value of a:");
         num1 = input.nextInt();

          System.out.println("Enter the value of b:");
          num2 = input.nextInt();

          sum = num1 + num2;

          product = num1 * num2;

          remainder = num1 % num2;

          division = num1 / num2;

          subtraction = num1 - num2;

          System.out.printf("sum is %d\n", sum);

          System.out.printf("product is %d\n", product);
          System.out.printf("remainder is %d\n", remainder);
          System.out.printf("division is %d\n", division);
          System.out.printf("subtraction is %d\n", subtraction);
    }
}
