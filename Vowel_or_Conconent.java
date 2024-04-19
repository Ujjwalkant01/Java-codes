// PROGRAM TO CHECK GIVEN ALPHABET IS VOWEL OR CONSONENT.
import java.util.Scanner;

public class Vowel_or_Conconent {
    public static void main(String[] args){

        char alphabet;

        System.out.print("Enter the Alphabet:");
        Scanner sc= new Scanner(System.in);
        alphabet = sc.next().charAt(0);

        if((alphabet>='A' && alphabet<='Z'  || alphabet>='a' && alphabet<='z')){

            switch (alphabet){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':


                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Alphabet is vowel");
                    break;
                default:
                    System.out.println("Alphabet is Consonent");
            }
        }
        else{
            System.out.println("Not an Alphabet");
        }


    }
}
