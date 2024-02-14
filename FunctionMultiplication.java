// make a function to multiply 2 numbers
import java.util.*;
public class FunctionMultiplication {
    public static int multiplication(int a, int b){
        //multiplication = a * b;
         return a * b;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();

       int multiplication = multiplication(a, b);
       System.out.println(multiplication);
    }
    
}
