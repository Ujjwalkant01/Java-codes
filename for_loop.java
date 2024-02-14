import java.util.Scanner;
public class for_loop {
    public static void main(String[] args){
        int num1;
        int num2;

           Scanner input = new Scanner(System.in);
           System.out.println("Enter number1:");
            num1= input.nextInt();
            System.out.println("Enter number2:");
              num2= input.nextInt();

              for(int i=0; i<=num1+num2; i++ ){
                 System.out.printf("%d\n", i);
                 
              }
    }
}
