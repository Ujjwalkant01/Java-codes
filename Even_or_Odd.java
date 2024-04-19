import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args){
        int num;
        int b;
        System.out.println("Enter the mumber");
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();


            switch (num % 2){
                case 0:
                    System.out.println("even");
                    break;
                case 1:
                    System.out.println("Odd");
            }
        }

}
