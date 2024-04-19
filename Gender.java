//PROGRAM TO IDENTIFY GENDER USING INPUT CHARACTER'S FIRTS LETTER.
import java.util.Scanner;

public class Gender {

    public static void main(String[] args){

        System.out.println("Enter The Gender (M/F) :");

        Scanner input = new Scanner(System.in);
        char gen;

     //   This line reads the input from the user and stores the first character in the gen variable.
        gen = input.next().charAt(0);

        switch (gen){
            case 'F':
                System.out.println("Female");
                break;
            case 'f':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;

            case 'm':
                System.out.println("Male");
                break;

            default:
                System.out.println("Invalid");


        }

    }
}
