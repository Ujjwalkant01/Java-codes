import java.util.Scanner;
public class if_else {
    public static void main(String[] args){
        int num1;
        int num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        num1= input.nextInt();
         System.out.println("Enter the value of b:");
         num2= input.nextInt();

             if(num1==num2){
                System.out.println("num1 and num2 is equal");
             }
                 else{
                    System.out.println("num1 and num2 is not equal");
                 }
    }
    
}
