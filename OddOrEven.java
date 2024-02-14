import java.util.*;
public class OddOrEven {
    public static void main(String[] args){

     System.out.print("Enter tha value of x :");

      Scanner sc = new Scanner(System.in);
      int x= sc.nextInt();
      
      if(x%2==0){
        System.out.println("Input number is Even number\n");
      }
      else{
        System.out.println("Input number is an Odd number");
      }


    }
    
}
