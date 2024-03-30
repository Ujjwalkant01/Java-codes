//program to encrypt a grade by adding 8 bit to it. result show the grade.

public class encrypt {
    public static void main(String[] args){
        char grade = 'B';
        grade= (char)(grade+8);
        System.out.println(grade);
    }
}
